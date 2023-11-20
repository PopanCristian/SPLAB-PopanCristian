package Lab1;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("Image URL: " + url);
    }

    @Override
    public void add(Element element) {
        // Not applicable for Image
    }

    @Override
    public void remove(Element element) {
        // Not applicable for Image
    }

    @Override
    public Element get(int index) {
        // Not applicable for Image
        return null;
    }

    // Getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

