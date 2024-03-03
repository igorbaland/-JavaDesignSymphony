package StructuralUltimateDesignPatterns.flyweight.spreadsheet.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellContextFactory {
    private  Map<Integer, CellContext> contexts = new HashMap<>();

    public CellContext getContext(String fontFamily, int fontSize, boolean isBold) {
        //Generate a unique key for the combination of attributes
        var hash = Objects.hash(fontFamily, fontFamily, isBold);

        if(!contexts.containsKey(hash))
            contexts.put(hash, new CellContext(fontFamily, fontSize, isBold));

        return contexts.get(hash);
    }


}
