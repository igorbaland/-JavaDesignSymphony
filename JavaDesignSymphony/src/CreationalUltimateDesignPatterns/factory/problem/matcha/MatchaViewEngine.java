package CreationalUltimateDesignPatterns.factory.problem.matcha;

import CreationalUltimateDesignPatterns.factory.problem.ViewEngine;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    /*
    method for rendering a view or template
        Type String, which is going be the html contents, we are going to return to the client.

        Products is the data/context that we have passed to this view. Map, we can pass multiple objects to our view
     */
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Matcha";
    }


}
