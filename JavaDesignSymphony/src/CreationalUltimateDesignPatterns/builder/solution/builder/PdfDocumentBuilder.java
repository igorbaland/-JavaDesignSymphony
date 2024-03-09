package CreationalUltimateDesignPatterns.builder.solution.builder;

import CreationalUltimateDesignPatterns.builder.problem.formats.PdfDocument;
import CreationalUltimateDesignPatterns.builder.solution.Slide;

public class PdfDocumentBuilder implements PresentationBuilder {
    private PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument() {
        return document;
    }
}
