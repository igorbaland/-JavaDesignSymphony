package UltimateDesignPatterns.state.paint.problem;

public class Canvas {
    /*
    If statements
      solve:
        > polymorphism

    State pattern
      > allow the object  to behave differently when it state changes.
     */

    private ToolType currentTool;

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("Selection icon");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("Brush icon");
        else if (currentTool == ToolType.ERASER)
            System.out.println("Eraser icon");
    }

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if (currentTool == ToolType.ERASER)
            System.out.println("Erase something");
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
