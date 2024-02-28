package UltimateDesignPatterns.visitor.solve.nodes;

import UltimateDesignPatterns.visitor.solve.HtmlNode;
import UltimateDesignPatterns.visitor.solve.operations.Operation;

public class HeadingNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
