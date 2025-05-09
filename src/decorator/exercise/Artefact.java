package decorator.exercise;

public class Artefact implements Marker {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    public String render() {
        return name;
    }
}