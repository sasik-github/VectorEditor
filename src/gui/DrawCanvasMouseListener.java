package gui;

import java.awt.Container;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import objects.PointButton;

public class DrawCanvasMouseListener extends MouseAdapter {

	private DrawCanvas parent;

	public DrawCanvasMouseListener(DrawCanvas parent) {

		this.parent = parent;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Hello");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Object source = e.getSource();

		Container panel = e.getComponent().getParent();

		System.out.println("Parent of button by clickin is " + panel);

		if (source instanceof PointButton) {
			PointButton button = (PointButton) source;
			button.movePointButton(e.getX(), e.getY());
		}

	}

}
