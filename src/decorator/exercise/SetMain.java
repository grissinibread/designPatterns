package decorator.exercise;

public class SetMain implements Marker {
    Marker marker;

    public SetMain(Marker marker) {
        this.marker = marker;
    }

    @Override
    public String render() {
        var render = marker.render();

        return render + " [Main]";
    }
}
