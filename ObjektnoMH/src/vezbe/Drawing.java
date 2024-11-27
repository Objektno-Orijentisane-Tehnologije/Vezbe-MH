package vezbe;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;

public class Drawing extends JPanel {

	public static void main(String [] args) {
		JFrame frame = new JFrame();
		Drawing drawing = new Drawing();
		frame.setSize(1200, 700);
		frame.setContentPane(drawing);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(150,150);
		Line l1 = new Line(new Point(0,0), new Point(1200,700));
		Rectangle r1 = new Rectangle(new Point(200,200), 50,50);
		Circle c1 = new Circle(new Point(500,500),40);
		Donut d1 = new Donut(new Point(600,600),40,20);
		
		g.setColor(Color.RED);
		p1.draw(g);
		l1.draw(g);
		r1.draw(g);
		c1.draw(g);
		d1.draw(g);
		
		g.setColor(Color.BLACK);
		
		
		
		
		
	}
}
