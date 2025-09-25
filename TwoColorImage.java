package images;

public class TwoColorImage extends BaseImage {
	
	private RGB zero, one;
    private TwoDFunc func;
	
	public TwoColorImage(int width, int height, RGB zero, RGB one, TwoDFunc func) {
		
		super(width, height);
        this.zero = zero;
        this.one = one;
        this.func = func;
	}
	
	@Override
    public RGB get(int x, int y) {
		double normX = (double) x / (getWidth());
		double normY = (double) y / (getHeight());
		double alpha = func.f(normX, normY);
		if (alpha <= 0) return zero;
		if (alpha >= 1) return one;
		return RGB.mix(one, zero, alpha);

    }
}
