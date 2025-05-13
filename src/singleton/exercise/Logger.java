package singleton.exercise;

public class Logger {
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String fileName;
    private static Logger instance = new Logger();

    public static Logger getInstance() {
        return instance;
    }

    private Logger() {}

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }
}