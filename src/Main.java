import abstractFactory.exercise.Demo;
import builder.MovieBuilder;
import builder.PdfDocumentBuilder;
import builder.Presentation;
import builder.Slide;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        var movie = builder.getMovie();
    }
}