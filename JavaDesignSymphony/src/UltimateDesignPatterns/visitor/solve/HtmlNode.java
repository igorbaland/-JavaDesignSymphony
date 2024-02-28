package UltimateDesignPatterns.visitor.solve;

import UltimateDesignPatterns.visitor.solve.operations.Operation;

public interface HtmlNode {
    void execute(Operation operation);
}
