package CreationalUltimateDesignPatterns.factory.problem.matcha;

import CreationalUltimateDesignPatterns.factory.problem.Controller;
import CreationalUltimateDesignPatterns.factory.problem.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        //Get products from a database
        Map<String, Object> context = new HashMap<>();
        //context.put(products);
        render("products.html", context,
                        //this the problem, where we are facing
                        new MatchaViewEngine());
    }
}
