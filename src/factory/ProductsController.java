package factory;

import factory.matcha.Controller;
import factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
