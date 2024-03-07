package CreationalUltimateDesignPatterns.factory.solution.sharp;

import CreationalUltimateDesignPatterns.factory.solution.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp.";
    }
}
