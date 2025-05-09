import memento.exercise.Document;
import memento.exercise.DocumentHistory;
import memento.exercise.DocumentState;

public class Main {
    public static void main(String[] args) {
        var document = new Document();
        var documentHistory = new DocumentHistory();

        document.setContent("content");
        document.setFontName("Arial");
        document.setFontSize("20");

        documentHistory.add(document.createState());

        document.setContent("content");
        document.setFontName("Bread");
        document.setFontSize("30");

        documentHistory.add(document.createState());
        document.restoreState(documentHistory.pop());

        System.out.println(document.getContent() + " " +
                document.getFontName() + " " +
                document.getFontSize());
    }
}