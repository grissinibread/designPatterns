package flyweight.exercise;

public class Attributes {
    private String fontFamily;
    private int fontSize;
    private boolean isBold;

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isBold() {
        return isBold;
    }
}
