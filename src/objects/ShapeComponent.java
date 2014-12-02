package objects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import gui.DrawCanvas;
import gui.DrawCanvas2;

import javax.swing.JComponent;

public class ShapeComponent extends JComponent {

	private static final long serialVersionUID = 1L;

	private DrawCanvas2 _canvas;

	private String _shapeName;

	public ShapeComponent(DrawCanvas2 canvas, String shapeName) {
		_canvas = canvas;
		_shapeName = shapeName;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		SimpleShape shape = _canvas.getShape(_shapeName);
		shape.draw(g2d, new Point(getWidth() / 2, getHeight() / 2));
	}

}
