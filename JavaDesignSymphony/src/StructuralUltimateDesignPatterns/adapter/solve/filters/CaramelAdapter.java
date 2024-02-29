package StructuralUltimateDesignPatterns.adapter.solve.filters;

import StructuralUltimateDesignPatterns.adapter.solve.Image;
import StructuralUltimateDesignPatterns.adapter.solve.filters.thirdpartylibraries.Caramel;

public class CaramelAdapter extends Caramel implements Filter{

    @Override
    public void apply(Image image) {
        /*
        This approach is not flexible as using composition
            Because in Java, we don't have multiple inheritance. So a class can only have a single parent

        In this demo,
            Filter is an interface
                It's perfectly acceptable to have a class
                    that extends in other class and implements an interface

        Favor composition
            over Inheritance
         */
        init();
        render(image);
    }
}
