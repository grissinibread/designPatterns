package memento.exercise;

import memento.EditorState;

public class Document {
    private String content;
    private String fontName;
    private String fontSize;

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restoreState(DocumentState documentState) {
        content = documentState.getContent();
        fontName = documentState.getFontName();
        fontSize = documentState.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

}
