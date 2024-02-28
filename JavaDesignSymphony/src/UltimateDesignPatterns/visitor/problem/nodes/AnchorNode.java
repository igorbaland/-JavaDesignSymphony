package UltimateDesignPatterns.visitor.problem.nodes;

import UltimateDesignPatterns.visitor.problem.HtmlNode;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight-anchor");
    }
}
