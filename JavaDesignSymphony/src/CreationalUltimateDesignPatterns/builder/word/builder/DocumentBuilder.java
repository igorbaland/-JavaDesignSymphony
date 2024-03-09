package CreationalUltimateDesignPatterns.builder.word.builder;

import CreationalUltimateDesignPatterns.builder.word.Image;
import CreationalUltimateDesignPatterns.builder.word.Text;

public interface DocumentBuilder {
    void addText(Text text);
    void addImage(Image image);
    String getResult();
}
