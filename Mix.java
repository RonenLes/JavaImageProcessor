package images;

public class Mix extends BinaryImageDecorator {
	
	private double alpha;
	
	public Mix(Image base1, Image base2,double alpha) {
		super(base1,base2);
		this.alpha = alpha;
	}
	
	public RGB get(int x,int y) {
		if(isDefinedInBase1(x, y) && isDefinedInBase2(x, y)) return RGB.mix(getBase1(x, y),getBase2(x, y), this.alpha);//if two image collide than mix color
		else return compareTo2(x, y);
	}
}
