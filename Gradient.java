package images;

public class Gradient extends BaseImage {
	
	
	private RGB start;//start color at width=0
	private RGB end; // end color at width = width
	
	
	public Gradient(int width, int height, RGB start, RGB end) {
		super(width,height);
		this.start = start;
		this.end=end;
		
	}
	
	@Override
	public RGB get(int x, int y) {
		
		double alpha = (double) x / (getWidth());//get the alpha based relation from x to width
        return RGB.mix(end, start, alpha);//return and mix the color at this point 
	}
            

}
