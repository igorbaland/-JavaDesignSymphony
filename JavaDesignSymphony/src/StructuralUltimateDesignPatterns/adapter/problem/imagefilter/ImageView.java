package StructuralUltimateDesignPatterns.adapter.problem.imagefilter;

import StructuralUltimateDesignPatterns.adapter.problem.Image;
import StructuralUltimateDesignPatterns.adapter.problem.filter.Filter;

public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter) {
        filter.apply(image);
    }
}
