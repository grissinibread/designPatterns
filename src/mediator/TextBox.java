package mediator;

public class TextBox extends UIControl {
    private String content;

    public TextBox(DialogBox owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String control) {
        this.content = control;
        owner.changed(this);
    }
}
