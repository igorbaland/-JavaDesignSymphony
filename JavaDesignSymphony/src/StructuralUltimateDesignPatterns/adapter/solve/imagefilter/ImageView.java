package StructuralUltimateDesignPatterns.adapter.solve.imagefilter;

import StructuralUltimateDesignPatterns.adapter.solve.Image;
import StructuralUltimateDesignPatterns.adapter.solve.filters.Filter;

public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter) {
        filter.apply(image);
    }
}
