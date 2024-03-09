package CreationalUltimateDesignPatterns.builder.solution.main;

import CreationalUltimateDesignPatterns.builder.solution.builder.PdfDocumentBuilder;
import CreationalUltimateDesignPatterns.builder.solution.Presentation;
import CreationalUltimateDesignPatterns.builder.solution.Slide;

public class BuilderSolutionDemo {
    public static void show() {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

//        var builder = new MovieBuilder();
        var builder = new PdfDocumentBuilder();
        /*
        tiny problem. return type -> void. We are not going to get the actual PDF document that is generated as part of
        this method, but we don't want to change
            void export() -> PdfDocument export()
                because maybe we generate a movie

                The type of the target object is really dependent on the type of

                create getter for movie/pdf in
                    PDFDocumentBuilder
                    MovieBuilder
         */
        presentation.export(builder);
//        var movie = builder.getMovie();
        var movie = builder.getPdfDocument();

    }
}
