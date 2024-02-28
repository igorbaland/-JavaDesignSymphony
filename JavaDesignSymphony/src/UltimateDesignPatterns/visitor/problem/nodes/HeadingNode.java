package UltimateDesignPatterns.visitor.problem.nodes;

import UltimateDesignPatterns.visitor.problem.HtmlNode;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight-heading");
    }
}
