package CreationalUltimateDesignPatterns.factory.solution.sharp;

import CreationalUltimateDesignPatterns.factory.solution.Controller;
import CreationalUltimateDesignPatterns.factory.solution.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
