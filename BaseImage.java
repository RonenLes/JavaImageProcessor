package images;

public abstract class BaseImage implements Image {
	
	//base image stats 
	private int width;
	private int height;
	
	
	public BaseImage(int width,int height) {
		
		this.width=width;
		this.height=height;
	}
	
	@Override
	public int getWidth() {
		return this.width;
	}
	
	@Override
	public  int getHeight() {
		return this.height;
	}
	
	
	public abstract RGB get(int x, int y); 
		
	
}
