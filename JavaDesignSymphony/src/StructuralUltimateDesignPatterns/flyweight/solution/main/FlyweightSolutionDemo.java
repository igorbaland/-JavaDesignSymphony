package StructuralUltimateDesignPatterns.flyweight.solution.main;

import StructuralUltimateDesignPatterns.flyweight.solution.PointIconFactory;
import StructuralUltimateDesignPatterns.flyweight.solution.PointService;

public class FlyweightSolutionDemo {
    public static void show() {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }
}
