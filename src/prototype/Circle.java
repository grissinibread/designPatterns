package prototype;

public class Circle implements Component {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering Circle");
    }

    @Override
    public Component duplicate() {
        var newCircle = new Circle();
        newCircle.setRadius(this.radius);
        return newCircle;
    }
}
