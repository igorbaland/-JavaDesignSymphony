package CreationalUltimateDesignPatterns.factory.solution;

import CreationalUltimateDesignPatterns.factory.solution.matcha.MatchaViewEngine;

import java.util.Map;

public abstract class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = createViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

//    protected abstract ViewEngine creationViewEngine();

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
