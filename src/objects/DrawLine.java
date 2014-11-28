package objects;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawLine implements SimpleShape {

	protected String _name = "DrawLine";

	protected PointButton _p1, _p2;

	public DrawLine(Point pointStart, Point pointEnd) {
		this._p1 =  new PointButton(pointStart);
		this._p2 = new PointButton(pointEnd);
	}

	public DrawLine(int xStart, int yStart, int xEnd, int yEnd) {
		_p1 = new PointButton(new Point(xStart, yStart));
		_p2 = new PointButton(new Point(xEnd, yEnd));
	}

	public void draw(Graphics2D g, Container parent) {
		parent.add(_p1);
		parent.add(_p2);
		parent.repaint();
		g.setColor(Color.WHITE);
		g.drawLine(_p1.getX(), _p1.getY(), _p2.getX(), _p2.getY());
	}

	public String getName() {
		return _name;
	}

}
