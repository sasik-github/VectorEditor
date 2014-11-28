package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

import objects.DrawLine;
import objects.SimpleShape;

public class DrawCanvas extends JPanel {

	private ArrayList<SimpleShape> _listObjects;

	public DrawCanvas() {
		_listObjects = new ArrayList<SimpleShape>();
		SimpleShape line1 = new DrawLine(new Point(20, 30), new Point(40, 50));
		_listObjects.add(line1);
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		super.paintComponent(g);
		setBackground(Color.BLACK);

		for (SimpleShape item : _listObjects) {
			item.draw(g2d);
		}

	}

}
