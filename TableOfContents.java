package Lab1;

public class TableOfContents implements Element {
    // Assuming TableOfContents has its own way of representing contents
    @Override
    public void print() {
        // Implementation of TableOfContents print
    }

    @Override
    public void add(Element element) {
        // Not applicable for TableOfContents
    }

    @Override
    public void remove(Element element) {
        // Not applicable for TableOfContents
    }

    @Override
    public Element get(int index) {
        // Not applicable for TableOfContents
        return null;
    }
}

