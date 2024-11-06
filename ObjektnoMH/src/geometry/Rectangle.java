package geometry;

public class Rectangle {

	private Point upperLeft;
	private int height;
	private int width;
	private boolean selected;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeft, int height, int width) {
		this.upperLeft = upperLeft;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(Point upperLeft, int height, int width, boolean selected) {
		this(upperLeft,height,width);
		this.selected = selected;
	}
	
	
	public int area() {
		return width * height;
	}
	
	public int circumference() {
		return 2*height + 2*width;
	}
	
	@Override
	public String toString() {
//		String string =  "Upper left point: (" + upperLeft.getX() + ", " +
//				upperLeft.getY() + "), width = " + width + ", height = " +
//				height;
//		System.out.println(string);
//		return string;
		return "Upper left point: (" + upperLeft.getX() + ", " +
				upperLeft.getY() + "), width = " + width + ", height = " +
				height;
	}
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
	
	
	
	
	
	
}
