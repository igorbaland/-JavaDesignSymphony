package UltimateDesignPatterns.visitor.solve.operations;

import UltimateDesignPatterns.visitor.solve.nodes.AnchorNode;
import UltimateDesignPatterns.visitor.solve.nodes.HeadingNode;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("text-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("text-anchor");
    }
}
