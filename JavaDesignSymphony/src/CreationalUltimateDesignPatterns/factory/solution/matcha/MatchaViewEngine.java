package CreationalUltimateDesignPatterns.factory.solution.matcha;

import CreationalUltimateDesignPatterns.factory.solution.ViewEngine;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "view rendered by Matcha";
    }
}
