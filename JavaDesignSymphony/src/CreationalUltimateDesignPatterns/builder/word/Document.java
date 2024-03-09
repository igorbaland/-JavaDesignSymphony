package CreationalUltimateDesignPatterns.builder.word;

import CreationalUltimateDesignPatterns.builder.word.builder.DocumentBuilder;
import CreationalUltimateDesignPatterns.builder.word.html.HtmlDocument;
import CreationalUltimateDesignPatterns.builder.word.html.HtmlImage;
import CreationalUltimateDesignPatterns.builder.word.html.HtmlParagraph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(DocumentBuilder builder, String fileName) throws IOException {
        /*
        Note that we have separated the construction of the target document from it's representation. The same
        construction algorithm is used  to generate different types of documents such as html, text etc.

        For text files, even thought we don't have images, we still use the same algorithm. It it simply ignores adding
        images.
         */

        for (Element element : elements) {
            if (element instanceof Text)
                builder.addText((Text) element);
            else if (element instanceof  Image) {
                builder.addImage((Image) element);
            }
        }

        var writer = new FileWriter(fileName);
        writer.write(builder.getResult());
        writer.close();
    }

//    public void export(ExportFormat format, String fileName) throws IOException {
//        String content = "";
//
//        if (format == ExportFormat.HTML) {
//            var document = new HtmlDocument();
//
//            for ( Element element : elements) {
//                if (element instanceof Text) {
//                    var text = ((Text)element).getContent();
//                    document.add(new HtmlParagraph(text));
//                } else if (element instanceof Image) {
//                    var source = ((Image)element).getSource();
//                    document.add(new HtmlImage(source));
//                }
//            }
//
//            content = document.toString();
//        } else if (format == ExportFormat.TEXT) {
//            var builder = new StringBuilder();
//
//            for (Element element : elements) {
//                if (element instanceof  Text) {
//                    var text = ((Text)element).getContent();
//                    builder.append(text);
//                }
//            }
//
//            content = builder.toString();
//        }
//
//        var writer = new FileWriter(fileName);
//        writer.write(content);
//        writer.close();
//    }
}
