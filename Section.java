package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elements = new ArrayList<>(); // List to hold child elements

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element element : elements) { // Changed 'children' to 'elements'
            element.print();
        }
    }

    public void add(Element element) { // Removed @Override as this is not an interface method
        elements.add(element);
    }

    public void remove(Element element) { // Removed @Override as this is not an interface method
        elements.remove(element);
    }

    public Element get(int index) { // Removed @Override as this is not an interface method
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getElements() { // Changed method name to 'getElements'
        return new ArrayList<>(elements);
    }
}
