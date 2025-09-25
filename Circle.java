package images;

public class Circle extends BaseImage {
	
	private int centerX;
	private int centerY;
	private int radius;
	private RGB center;
	private RGB outside;
	
	
	public Circle(int width, int height, int centerX , int centerY,int radius, RGB center,RGB outside) {
		super(width,height);
		this.centerX= centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.center = center;
		this.outside=outside;
	}
	
	public Circle(int size,int radius,RGB center,RGB outside) {
		super(size,size);
		this.centerX = size/2;
		this.centerY = size/2;
		this.radius=radius;
		this.center = center;
		this.outside = outside;
	}
	
	@Override
	public RGB get(int x, int y) {
		double distance = Math.sqrt(Math.pow(this.centerX - x, 2) + Math.pow(this.centerY - y, 2));//distance from center to coords
		
		if (distance >= this.radius)  return this.outside; //coords are outside the circle 
            
		
		return RGB.mix(outside, center, distance/radius); // inside circle
	}
	
}
