package images;

public abstract class BinaryImageDecorator implements Image {
	
	private Image base1;
	private Image base2;
	
	//works with 2 images
	public BinaryImageDecorator(Image base1 , Image base2) {
		this.base1 = base1;
		this.base2 = base2;
	}
	
	//max width of new image
	@Override
	public int getWidth() {
		return Math.max(base1.getWidth(), base2.getWidth());
	}
	
	//max height of new image
	@Override
	public int getHeight() {
		return Math.max(base1.getHeight(), base2.getHeight());
	}
	
	
	public abstract RGB get(int x,int y);
	
	//return base1 color at x,y
	public RGB getBase1(int x, int y) {
		return base1.get(x, y);
	}
	
	//return base2 color at x,y
	public RGB getBase2(int x, int y) {
		return base2.get(x, y);
	}
	
	//check whether new cords are inside base1
	protected boolean isDefinedInBase1(int x, int y) {
	    return x >= 0 && y >= 0 &&
	           x < base1.getWidth() &&
	           y < base1.getHeight();
	}
	
	//check whether new cords are inside base2
	protected boolean isDefinedInBase2(int x, int y) {
	    return x >= 0 && y >= 0 &&
	           x < base2.getWidth() &&
	           y < base2.getHeight();
	}

	//comparing two images to check if collide 
	protected RGB compareTo2(int x, int y) {
		boolean b1 =x < base1.getWidth() && y < base1.getHeight();
		boolean b2 = x < base2.getWidth() && y <base2.getHeight();
		
		if(b1 && !b2) return base1.get(x, y);
		if(!b1 && b2) return base2.get(x, y);
		return RGB.BLACK;
		
	}
	
}
