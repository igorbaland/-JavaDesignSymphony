package UltimateDesignPatterns.visitor.solve.operations;

import UltimateDesignPatterns.visitor.solve.nodes.AnchorNode;
import UltimateDesignPatterns.visitor.solve.nodes.HeadingNode;
import UltimateDesignPatterns.visitor.solve.operations.Operation;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight-anchor");
    }
}
