package Lab1;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String url;
    private Dimension dim;
    private Picture content;

    public Image(String name) {
    	this.url = url;
    	this.dim = dim;
        this.content = content;
    	try {
    	TimeUnit.SECONDS.sleep(5);
    	} catch (InterruptedException e) {
    	e.printStackTrace();
    	}
    	}

    @Override
    public void print() {
        System.out.println("Image URL: " + url);
    }

    @Override
    public void add(Element element) {
    }

    @Override
    public void remove(Element element) {
    }

    @Override
    public Element get(int index) {
        return null;
    }

    public String url() {
        return url;
    }

    //@Override
    //public Dimension dim() {
    //    return dim;
    //}

   // @Override
    //public Picture content() {
    //    return content;
    //}
}

