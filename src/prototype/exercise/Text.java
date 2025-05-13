package prototype.exercise;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component duplicate() {
        Text target = new Text(this.content);
        return target;
    }
}