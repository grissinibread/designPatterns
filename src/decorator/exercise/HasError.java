package decorator.exercise;

public class HasError implements Marker {
    Marker marker;

    public HasError(Marker marker) {
        this.marker = marker;
    }

    @Override
    public String render() {
        var render = marker.render();

        return render + " [Error]";
    }
}
