package StructuralUltimateDesignPatterns.adapter.problem.main;

import StructuralUltimateDesignPatterns.adapter.problem.Image;
import StructuralUltimateDesignPatterns.adapter.problem.filter.VividFilter;
import StructuralUltimateDesignPatterns.adapter.problem.filter.thirdlibraries.Caramel;
import StructuralUltimateDesignPatterns.adapter.problem.imagefilter.ImageView;

public class ProblemWithoutAdapterDemo {
    public static void show() {
        var imageView = new ImageView(new Image());
//        imageView.apply(new VividFilter());
        /*
        let's imagine as part of building this mobile app, we are going use a third party library that includes 10s of
        beautiful filters. We don't want to hold from scratch, we want to reuse them.

        filter/thirdLibraries

        We have a compilation error

            Because the interface of Caramel class doesn't match what the apply method expects

            Our apply mathe expects an instance of a class that implements the filter interface
                Caramel !implements Filter
                and doesn't have an apply method

            This is where we use
                the adapter pattern
         */
//        imageView.apply(new Caramel());
    }
}
