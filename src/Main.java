import proxy.exercise.Demo;
import singleton.ConfigManager;
import singleton.exercise.Logger;

public class Main {
    public static void main(String[] args) {
        var logger = Logger.getInstance();
        logger.setFileName("./logs/demo.log");

        logger.write("bread");
    }
}