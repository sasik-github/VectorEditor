package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import objects.DrawLine;
import objects.PointButton;
import objects.SimpleShape;

public class DrawCanvas extends JPanel {

	private ArrayList<SimpleShape> _listObjects;

	private MouseListener drawCanvasMouseListener;

	public DrawCanvas() {
		setLayout(null);
		_listObjects = new ArrayList<SimpleShape>();
		drawCanvasMouseListener = new DrawCanvasMouseListener(this);
		SimpleShape line1 = new DrawLine(new Point(20, 30), new Point(70, 50));
		SimpleShape point = new PointButton(new Point(100, 300));

		_listObjects.add(line1);
		_listObjects.add(point);
		addActionListener();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		rh.put(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);

		g2d.setRenderingHints(rh);

		
		
		Rectangle r = getBounds();
//		g2d.clearRect(0, 0, r.width, r.height);
		
		setBackground(Color.BLACK);
	    

		for (SimpleShape item : _listObjects) {
			item.draw(g2d, this);
		}

//		g2d.dispose();

	}
	
	

//	@Override
//	public void paint(Graphics g) {
//		// TODO Auto-generated method stub
//		super.paint(g);
//		Graphics2D g2d = (Graphics2D) g;
//
//		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
//				RenderingHints.VALUE_ANTIALIAS_ON);
//
//		rh.put(RenderingHints.KEY_RENDERING,
//				RenderingHints.VALUE_RENDER_QUALITY);
//
//		g2d.setRenderingHints(rh);
//
//		
//		
//		Rectangle r = getBounds();
////		g2d.clearRect(0, 0, r.width, r.height);
//		g2d.setBackground(Color.WHITE);
//	    
//
//		for (SimpleShape item : _listObjects) {
//			item.draw(g2d, this);
//		}
//
////		g2d.dispose();
//	}


	public void addActionListener() {
		this.addMouseListener(drawCanvasMouseListener);
//		for (SimpleShape item : _listObjects) {
//			item.addMouseListener(drawCanvasMouseListener);
//		}

	}

}
