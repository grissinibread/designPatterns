package flyweight.exercise;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private Attributes attributes;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public String getContent() {
    return content;
  }

  public void setAttributes(String fontFamily, int fontSize, boolean isBold) {
    attributes.setFontFamily(fontFamily);
    attributes.setFontSize(fontSize);
    attributes.setBold(isBold);
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, attributes.getFontFamily());
  }
}
