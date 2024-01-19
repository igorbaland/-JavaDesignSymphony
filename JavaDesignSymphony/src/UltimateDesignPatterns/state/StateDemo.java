package UltimateDesignPatterns.state;

import UltimateDesignPatterns.state.stopwatch.Stopwatch;
import UltimateDesignPatterns.state.paint.solve.Canvas;
import UltimateDesignPatterns.state.paint.solve.EraserTool;
import UltimateDesignPatterns.state.travel.solve.BicyclingTravel;
import UltimateDesignPatterns.state.travel.solve.DirectionService;
import UltimateDesignPatterns.state.travel.solve.WalkingTravel;

public class StateDemo {
    /*
    Open closed principle
      > open for extension
      > closed for modification

    With this principle we can add functionality without changing the existing code.
     */

    public static void showTravel() {
        var service = new DirectionService(new WalkingTravel());
        service.getEta();
        service.getDirection();
    }

    public static void showAbuseStopwatch() {
        var watch = new UltimateDesignPatterns.state.stopwatch.abuse.Stopwatch();
        watch.click();
        watch.click();
        watch.click();
    }

    public static void showStopWatch() {
        var watch = new Stopwatch();
        watch.click();
        watch.click();
        watch.click();
    }

    public static void showPaintTools() {
        var canvas = new Canvas();
//        canvas.setCurrentTool(new SelectionTool());
        canvas.setCurrentTool(new EraserTool());
//        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
