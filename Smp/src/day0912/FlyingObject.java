package day0912;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	protected int width;
	protected int height;
	protected BufferedImage image;
	protected int x;
	protected int y;
	
	public abstract void step();
	
	public abstract boolean outOfBounds();
}
