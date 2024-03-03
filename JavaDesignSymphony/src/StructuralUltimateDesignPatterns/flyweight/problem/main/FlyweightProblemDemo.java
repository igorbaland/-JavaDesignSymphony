package StructuralUltimateDesignPatterns.flyweight.problem.main;

import StructuralUltimateDesignPatterns.flyweight.problem.PointService;

public class FlyweightProblemDemo {
    public static void show() {
        var service = new PointService();
        for (var point : service.getPoints())
            point.draw();
    }
}
