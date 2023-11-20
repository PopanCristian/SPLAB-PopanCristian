package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        SubChapter newSubChapter = new SubChapter(subChapterName);
        subChapters.add(newSubChapter);
        return subChapters.size() - 1; // Returnează indexul noului SubChapter adăugat
    }

    public SubChapter getSubChapter(int index) {
        if (index >= 0 && index < subChapters.size()) {
            return subChapters.get(index);
        } else {
            return null; // sau aruncați o excepție dacă indexul este incorect
        }
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print(); // Apelează metoda print() pentru fiecare SubChapter
        }
    }
}
