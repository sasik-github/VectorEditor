package gui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GUI extends JFrame {

	private static final int CANVAS_WIDTH = 640;
	private static final int CANVAS_HEIGHT = 480;

	private DrawCanvas _canvas;

	public GUI() {

		_canvas = new DrawCanvas();
		_canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

		Container cp = getContentPane();
		cp.add(_canvas);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setTitle("....");
		setVisible(true);

	}

}
