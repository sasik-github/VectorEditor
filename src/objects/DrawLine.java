package objects;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawLine implements SimpleShape, ActionListener{

	protected String _name = "DrawLine";

	protected Point _p1, _p2;

	public DrawLine(Point pointStart, Point pointEnd) {
		this._p1 = pointStart;
		this._p2 = pointEnd;
	}

	public DrawLine(int xStart, int yStart, int xEnd, int yEnd) {
		_p1 = new Point(xStart, yStart);
		_p2 = new Point(xEnd, yEnd);
	}

	public void draw(Graphics2D g) {
		g.drawLine(_p1.x, _p1.y, _p2.x, _p2.y);
	}

	public String getName() {
		return _name;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = e.getActionCommand();
		System.out.println(name);
		
	}

}
