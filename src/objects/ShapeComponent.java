package objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import gui.DrawCanvas;
import gui.DrawCanvas2;

import javax.swing.BorderFactory;
import javax.swing.JComponent;

//import ru.sasik.gui.simple.CanvasPanel;

public class ShapeComponent extends JComponent {

	private static final long serialVersionUID = 1L;

	private DrawCanvas2 _canvas;

	private String _shapeName;
	
	public static final int displacmentX = 35;

	public ShapeComponent(DrawCanvas2 canvasPanel, String shapeName) {
		_canvas = canvasPanel;
		_shapeName = shapeName;
//		 setPreferredSize(new Dimension(5, 5));
//		setBorder(BorderFactory.createRaisedBevelBorder());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		SimpleShape shape = _canvas.getShape(_shapeName);
		System.out.println("ShapeComponent.paintComponent() w:" + getWidth()
				+ " h:" + getHeight());
		shape.draw(g2d, new Point(getWidth(), getHeight()));
		g2d.setBackground(Color.WHITE);
	}

}
