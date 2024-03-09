package CreationalUltimateDesignPatterns.builder.word.main;

import CreationalUltimateDesignPatterns.builder.word.Document;
import CreationalUltimateDesignPatterns.builder.word.ExportFormat;
import CreationalUltimateDesignPatterns.builder.word.Image;
import CreationalUltimateDesignPatterns.builder.word.Text;
import CreationalUltimateDesignPatterns.builder.word.builder.HtmlDocumentBuilder;
import CreationalUltimateDesignPatterns.builder.word.builder.TextDocumentBuilder;

import java.io.IOException;

public class WordBuilderDemo {
    public static void show() throws IOException{
        var document = new Document();
        document.add(new Text("Hello World"));
        document.add(new Image("pic1.jpg"));

        document.export(new HtmlDocumentBuilder(), "export.html");
        document.export(new TextDocumentBuilder(), "export.txt");
    }

//    public static void demo() throws IOException {
//        var document = new Document();
//        document.add(new Text("Hello world"));
//        document.add(new Image("pic1.jpg"));
//
//        document.export(ExportFormat.HTML, "export.html");
//
//        // only writes the text elements to the file
//        document.export(ExportFormat.TEXT, "export.txt");
//    }
}
