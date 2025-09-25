package images;

public class RGB {
	
	private double red;
	private double green;
	private double blue;
	
	
	public RGB(double red, double green,double blue) {
		this.red = red;
		this.green = green;
		this.blue=blue;
	}
	
	
	public RGB(double grey) {
		this.red = grey;
		this.green = grey;
		this.blue = grey;
	}
	
	public double getRed() {
		return this.red;
	}
	
	public double getGreen() {
		return this.green;
	}
	
	public double getBlue() {
		return this.blue;
	}
	
	public RGB invert() {
		return new RGB(1-this.red,1-this.green,1-this.blue);
	}
	
	public RGB filter(RGB filter) {
		return new RGB(this.red*filter.getRed(),this.green*filter.getGreen(),this.blue*filter.getBlue());
	}
	
	public static RGB superpose(RGB rgb1, RGB rgb2) {
		double newRed = Math.min(rgb1.getRed()+rgb2.getRed(), 1.0);
		double newGreen = Math.min(rgb1.getGreen()+rgb2.getGreen(), 1.0);
		double newBlue = Math.min(rgb1.getBlue()+rgb2.getBlue(), 1.0);
		return new RGB(newRed,newGreen,newBlue);
	}
	
	public static RGB mix(RGB rgb1,RGB rgb2,double alpha) {
		
		double newRed = alpha*rgb1.getRed() + (1-alpha)*rgb2.getRed();
		double newGreen = alpha*rgb1.getGreen()+(1-alpha)*rgb2.getGreen();
		double newBlue = alpha*rgb1.getBlue()+(1-alpha)*rgb2.getBlue();
		return new RGB(newRed,newGreen,newBlue);
	}
	
	public String toString() {
		 return String.format("<%.4f, %.4f, %.4f>", this.red, this.green, this.blue);
	}
	
	public static final RGB BLACK = new RGB(0);
	public static final RGB WHITE = new RGB(1);
	public static final RGB RED = new RGB(1,0,0);
	public static final RGB GREEN = new RGB(0,1,0);
	public static final RGB BLUE = new RGB(0,0,1);	

}
