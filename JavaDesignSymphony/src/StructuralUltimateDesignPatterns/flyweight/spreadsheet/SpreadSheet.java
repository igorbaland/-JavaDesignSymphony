package StructuralUltimateDesignPatterns.flyweight.spreadsheet;

import StructuralUltimateDesignPatterns.flyweight.spreadsheet.factory.CellContext;
import StructuralUltimateDesignPatterns.flyweight.spreadsheet.factory.CellContextFactory;

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;
    //In a real app, these values should not be hardcoded here.
    //They should be read from a configuration file.
    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];
    private CellContextFactory contextFactory;

    public SpreadSheet(CellContextFactory contextFactory) {
        this.contextFactory = contextFactory;

        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExists(row, col);

        cells[row][col].setContent(content);
    }

    //we could have a similar method font setting the fontSize or isBold
    //for a given cell.
    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExists(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getContext();
        var context = contextFactory.getContext(
                fontFamily, currentContext.getFontSize(), currentContext.isBold()
        );
        cells[row][col].setContext(context);
    }

    public void ensureCellExists(int row, int col) {
        if (row < 0 || row >= MAX_ROWS)
            throw new IllegalArgumentException();

        if (col < 0 || col >= MAX_COLS)
            throw new IllegalArgumentException();
    }

    private void generateCells() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col] = new Cell(row, col, getDefaultContext());

    }

    private CellContext getDefaultContext() {
        //In the real app, these values  should not be hardcoded.
        //They should be read from a configuration file.
        return new CellContext("Times New Roman", 12, false);
    }

    public void render() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col].render();
    }

}
