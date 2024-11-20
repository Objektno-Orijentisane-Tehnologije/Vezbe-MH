package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape {

	private Point upperLeft;
	private int height;
	private int width;
	
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
	public void draw(Graphics g) {
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, height);
	}
	
	public boolean contains(int x, int y) {
		return (x >= upperLeft.getX() && x <= upperLeft.getX()+width)
				&&
				(y >= upperLeft.getY() && y <= upperLeft.getY()+height);
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
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
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			Rectangle temp = (Rectangle) o;
			if(width == temp.getWidth() && height == temp.getHeight()) {
				return true;
			}
		}
		return false;
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
	
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	
	
	
	
	
	
}
