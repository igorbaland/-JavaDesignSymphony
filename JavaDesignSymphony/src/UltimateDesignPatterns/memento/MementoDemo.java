package UltimateDesignPatterns.memento;

import UltimateDesignPatterns.memento.undo.document.Document;
import UltimateDesignPatterns.memento.undo.editor.Editor;
import UltimateDesignPatterns.memento.undo.editor.History;

public class MementoDemo {
    public static void showEditor() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
//        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }

    public static void showDocument() {
        var document = new Document();
        var history = new UltimateDesignPatterns.memento.undo.document.History();

        document.setContent("Hello");
        history.push(document.createState());

        document.setFontName("Font 1");
        history.push(document.createState());

        document.setFontSize(10);

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}
