package StructuralUltimateDesignPatterns.adapter.solve.filters;

import StructuralUltimateDesignPatterns.adapter.solve.Image;
import StructuralUltimateDesignPatterns.adapter.solve.filters.thirdpartylibraries.Caramel;

public class CaramelFilter implements Filter {
    /*
    in this implementation, we are using composition.
        but we can also use inheritance
            create class CaramelAdapter
     */
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
