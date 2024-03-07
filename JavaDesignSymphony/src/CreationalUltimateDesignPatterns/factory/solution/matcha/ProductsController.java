package CreationalUltimateDesignPatterns.factory.solution.matcha;

import CreationalUltimateDesignPatterns.factory.solution.Controller;
import CreationalUltimateDesignPatterns.factory.solution.ViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }

}
