package Lab1;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("SubChapter: " + name);
        for (Element element : elements) {
            element.print();
        }
    }
}
