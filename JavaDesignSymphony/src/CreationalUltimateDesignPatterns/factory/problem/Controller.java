package CreationalUltimateDesignPatterns.factory.problem;

import CreationalUltimateDesignPatterns.factory.problem.ViewEngine;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context,
                       //Problem with a controller in problem.file
                       ViewEngine engine) {
//        var engine = new MatchaViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }
}
