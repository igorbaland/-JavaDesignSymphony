package StructuralUltimateDesignPatterns.adapter.solve.main;

import StructuralUltimateDesignPatterns.adapter.solve.Image;
import StructuralUltimateDesignPatterns.adapter.solve.filters.CaramelFilter;
import StructuralUltimateDesignPatterns.adapter.solve.filters.thirdpartylibraries.Caramel;
import StructuralUltimateDesignPatterns.adapter.solve.imagefilter.ImageView;

public class AdapterMainDemo {
    public static void show() {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
