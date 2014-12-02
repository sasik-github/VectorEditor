package gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import objects.PointButton;
import objects.SimpleShape;

public class DrawCanvasMouseListener extends MouseAdapter {

	private DrawCanvas parent;

	public DrawCanvasMouseListener(DrawCanvas parent) {

		this.parent = parent;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("DrawCanvasMouseListener.mouseClicked()");
		
		super.mouseClicked(e);
		
		for (SimpleShape item : parent.get_listObjects()) {
//			if (item.)
//			java.awt.geom.
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Component obj = parent.getComponentAt(e.getPoint());
		
		System.out.println("DrawCanvasMouseListener.mousePressed() at " + obj);
//		System.out.println("DrawCanvasMouseListener.mousePressed() " + p);
		
//		if (obj instanceof PointButton) {
//			PointButton button = (PointButton) obj;
////			parent.setCursor(cursor);
//			
//			button.movePointButton(e.getX(), e.getY());
//		}
		

	}

}
