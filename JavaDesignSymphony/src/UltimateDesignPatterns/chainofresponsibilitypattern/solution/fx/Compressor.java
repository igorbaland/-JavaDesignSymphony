package UltimateDesignPatterns.chainofresponsibilitypattern.solution.fx;

import UltimateDesignPatterns.chainofresponsibilitypattern.solution.Handler;
import UltimateDesignPatterns.chainofresponsibilitypattern.solution.HttpRequest;

public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");

        return false;
    }
}
