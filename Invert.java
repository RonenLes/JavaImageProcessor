package images;

public class Invert extends ImageDecorator {
	
	public Invert(Image base) {
		super(base);
		
	}
	
	@Override
	public RGB get(int x, int y) {
		return super.get(x, y).invert();
	}

}
