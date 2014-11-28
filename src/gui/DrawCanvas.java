package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import objects.DrawLine;
import objects.PointButton;
import objects.SimpleShape;

public class DrawCanvas extends JPanel {

	private ArrayList<SimpleShape> _listObjects;

	public DrawCanvas() {
		setLayout(null);
		_listObjects = new ArrayList<SimpleShape>();
		SimpleShape line1 = new DrawLine(new Point(20, 30), new Point(40, 50));
		SimpleShape point = new PointButton(new Point(100, 300));

		_listObjects.add(line1);
		_listObjects.add(point);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		rh.put(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);

		g2d.setRenderingHints(rh);

		setBackground(Color.BLACK);

		for (SimpleShape item : _listObjects) {
			item.draw(g2d, this);
		}

	}

}
