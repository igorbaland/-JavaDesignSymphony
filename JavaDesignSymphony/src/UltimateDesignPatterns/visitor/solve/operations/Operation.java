package UltimateDesignPatterns.visitor.solve.operations;

import UltimateDesignPatterns.visitor.solve.nodes.AnchorNode;
import UltimateDesignPatterns.visitor.solve.nodes.HeadingNode;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
