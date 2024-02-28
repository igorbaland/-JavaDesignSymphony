package UltimateDesignPatterns.visitor.problem.main;

import UltimateDesignPatterns.visitor.problem.nodes.AnchorNode;
import UltimateDesignPatterns.visitor.problem.nodes.HeadingNode;
import UltimateDesignPatterns.visitor.problem.HtmlDocument;

public class VisitorDemo {
    public static void show() {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.highlight();

        /*
        Tomorrow we want to introduce a new operation in this object structure, perhaps we want to convert a HTML
        document to plain text. We only extract a text inside this document

        Heading
        Click me

        We have to go tour interface, introduce
        String plainText
            And then we have to implement this method in our entire object structure
         */
    }
}
