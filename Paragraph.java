package Lab1;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    @Override
    public void add(Element element) {
        // Not applicable for Paragraph
    }

    @Override
    public void remove(Element element) {
        // Not applicable for Paragraph
    }

    @Override
    public Element get(int index) {
        // Not applicable for Paragraph
        return null;
    }

    // Getters and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

