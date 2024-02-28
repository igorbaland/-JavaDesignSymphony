package UltimateDesignPatterns.visitor.solve.main;

import UltimateDesignPatterns.visitor.solve.operations.HighlightOperation;
import UltimateDesignPatterns.visitor.solve.HtmlDocument;
import UltimateDesignPatterns.visitor.solve.nodes.AnchorNode;
import UltimateDesignPatterns.visitor.solve.nodes.HeadingNode;
import UltimateDesignPatterns.visitor.solve.operations.PlainTextOperation;

public class VisitorSolveDemo {
    public static void show()  {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new PlainTextOperation());
//        document.execute(new HighlightOperation());
    }
}
