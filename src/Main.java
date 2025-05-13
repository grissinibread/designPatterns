import factory.ProductsController;
import proxy.exercise.Demo;
import singleton.ConfigManager;
import singleton.exercise.Logger;

public class Main {
    public static void main(String[] args) {
        new ProductsController().listProducts();
    }
}