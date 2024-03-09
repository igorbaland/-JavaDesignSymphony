package CreationalUltimateDesignPatterns.builder.word.builder;

import CreationalUltimateDesignPatterns.builder.word.Image;
import CreationalUltimateDesignPatterns.builder.word.Text;
import CreationalUltimateDesignPatterns.builder.word.html.HtmlDocument;
import CreationalUltimateDesignPatterns.builder.word.html.HtmlImage;
import CreationalUltimateDesignPatterns.builder.word.html.HtmlParagraph;

public class HtmlDocumentBuilder implements DocumentBuilder{
    private HtmlDocument document = new HtmlDocument();

    @Override
    public void addText(Text text) {
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addImage(Image image) {
        document.add(new HtmlImage(image.getSource()));
    }

    @Override
    public String getResult() {
        return document.toString();
    }
}
