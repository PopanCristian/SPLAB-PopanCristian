package Lab1;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        if(this.alignStrategy != null) {
            this.alignStrategy.render(text);
        } else {
            System.out.println(this);
        }
    }
    
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
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

