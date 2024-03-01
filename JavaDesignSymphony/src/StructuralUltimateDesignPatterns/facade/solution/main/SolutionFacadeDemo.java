package StructuralUltimateDesignPatterns.facade.solution.main;

import StructuralUltimateDesignPatterns.facade.solution.NotificationService;

public class SolutionFacadeDemo {
    public static void show() {
        var service = new NotificationService();
        service.send("Hello World", "target");
    }
}
