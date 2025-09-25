package images;

public class Superpose extends BinaryImageDecorator {
	
	public Superpose(Image base1,Image base2) {
		super(base1,base2);
	}
	
	@Override
	public RGB get(int x,int y) {
		
		if(isDefinedInBase1(x, y) && isDefinedInBase2(x, y)) return RGB.superpose(getBase1(x, y), getBase2(x, y));//if collide superpose colors
		else return compareTo2(x, y);
				
	}
	
}
