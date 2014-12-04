package objects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class PointButton implements SimpleShape {

	public void draw(Graphics2D g2, Point p) {
		int x = p.x - 12;
		int y = p.y - 12;

		g2.setColor(Color.RED);
		g2.drawOval(x, y, 5, 5);
		g2.fillOval(x, y, 5, 5);
//		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMouseListener(MouseListener mListener) {
		// TODO Auto-generated method stub

	}

}
