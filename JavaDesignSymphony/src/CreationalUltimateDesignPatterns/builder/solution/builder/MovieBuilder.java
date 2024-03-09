package CreationalUltimateDesignPatterns.builder.solution.builder;

import CreationalUltimateDesignPatterns.builder.solution.Slide;
import CreationalUltimateDesignPatterns.builder.solution.builder.PresentationBuilder;
import CreationalUltimateDesignPatterns.builder.solution.formats.Movie;

public class MovieBuilder implements PresentationBuilder {
    private Movie movie = new Movie();
    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 3);
    }

    public Movie getMovie() {
        return movie;
    }
}
