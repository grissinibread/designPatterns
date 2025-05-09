package decorator.exercise;

public class Editor {
    public void openProject(String path) {
        Marker[] artefacts = {
                new HasError(new SetMain(new Artefact("Main"))),
                new HasError(new Artefact("Demo")),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}