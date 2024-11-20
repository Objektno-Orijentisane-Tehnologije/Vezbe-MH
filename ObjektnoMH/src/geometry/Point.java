package geometry;

import java.awt.Graphics;

public class Point extends Shape {

	private int x;
	private int y;
	
	public Point() {
		//Default konstruktor
	}
	
//	Overloading zbog razlicitih parametara
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	
	public double distance(Point p) {
		int dx = x - p.x;
		int dy = y - p.y;
		double distance = Math.sqrt(dx*dx + dy*dy);
		return distance;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x - 3, y, x + 3, y);
		g.drawLine(x, y - 3, x, y + 3);
	}
	
	public boolean contains(int x, int y) {
		return distance(new Point(x,y)) <= 2;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Point) {
			Point temp = (Point) o;
			if(x == temp.getX() && y == temp.getY()) {
				return true;
			}
		}
		return false;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
//		System.out.println(this);
//		System.out.println(this.x);
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	
}
