package images;

public abstract class ImageDecorator implements Image {
	
	private BaseImage base;
	
	
	public ImageDecorator(Image base) {
		this.base =(BaseImage)base;
	}
	
	public int getWidth() {
		return base.getWidth();
	}
	public int getHeight() {
		return base.getHeight();
	}
	public RGB get(int x, int y) {
		return base.get(x, y);
	}
	
}
