package objects;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class PointButton extends JButton implements SimpleShape {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static final int RADIUSBUTTON = 5;

	protected Point _point;

	protected Rectangle _rectangle;

	public PointButton(Point point) {
		_point = point;
		_rectangle = new Rectangle();
		draw();
		setBackground(Color.RED);
		setCursor(new Cursor(Cursor.HAND_CURSOR));

		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Random random = new Random();
				// _point = new Point(random.nextInt(300), random.nextInt(200));
				// System.out.println("New point " + _point);
				// draw();
			}
		});
	}

	public void draw() {
		_rectangle.setBounds(_point.x, _point.y, RADIUSBUTTON, RADIUSBUTTON);
		setBounds(_rectangle);
	}

	@Override
	public void draw(Graphics2D g, Container parent) {
		parent.add(this);
		draw();
	}

	public void movePointButton(int x, int y) {
		_point = new Point(x, y);
		draw();
	}

	// @Override
	// protected void paintComponent(Graphics g) {
	// super.paintComponent(g);
	// Dimension originalSize = super.getPreferredSize();
	// int gap = (int) (originalSize.height * 0.2);
	// int x = originalSize.width + gap;
	// int y = gap;
	// int diameter = originalSize.height - (gap * 2);
	// Graphics2D g2d = (Graphics2D) g;
	//
	// g2d.setColor(Color.GREEN);
	// g2d.drawOval(x, y, diameter, diameter);
	//
	// // g2d.dispose();
	// }

}
