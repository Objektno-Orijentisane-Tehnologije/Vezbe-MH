package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	public double length() {
		return startPoint.distance(endPoint);
	}
	
	public boolean contains(int x, int y) {
		Point click = new Point(x,y);
		return (startPoint.distance(click) + 
				endPoint.distance(click)) - length() <= 2;
	}
	
	@Override
	public String toString() {
		return "(" + startPoint.getX() + ", " + startPoint.getY() +
				") --> (" + endPoint.getX() + ", " + endPoint.getY() + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Line) {
			Line temp = (Line) o;
			if(startPoint.equals(temp.getStartPoint()) &&
					endPoint.equals(temp.getEndPoint())) {
				return true;
			}
		}
		return false;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
