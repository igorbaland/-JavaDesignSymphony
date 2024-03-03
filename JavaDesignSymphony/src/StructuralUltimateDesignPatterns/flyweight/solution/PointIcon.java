package StructuralUltimateDesignPatterns.flyweight.solution;

import StructuralUltimateDesignPatterns.flyweight.solution.PointType;

public class PointIcon {
    //final, ensure that once initialize them using the constructor, we cannot change them later on.
    //Also, we are not going create a setter for this field. If we create a setter, the compiler is going to complain
    //  because we declared this field a final
    private final PointType type;
    private final byte[] icon;

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
