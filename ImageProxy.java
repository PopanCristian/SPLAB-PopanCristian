package Lab1;

import java.awt.Dimension;

public class ImageProxy implements Element {
    private String url;
    private Dimension dim;
    private Image realImg;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if (realImg == null) {
            realImg = new Image(url);
        }
        return realImg;
    }

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
   
}

