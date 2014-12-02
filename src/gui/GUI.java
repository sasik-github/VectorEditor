package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import objects.ShapeComponent;
import objects.SimpleShape;

public class GUI extends JFrame {

	private static final int CANVAS_WIDTH = 640;
	private static final int CANVAS_HEIGHT = 480;

	private JToolBar m_toolbar;
	private String m_selected;
	private ShapeComponent m_selectedComponent;
	private Map m_shapes = new HashMap<>();
	private ActionListener m_reusableActionListener;
	private DrawCanvas2 _canvas;

	public GUI() {

		m_toolbar = new JToolBar("Toolbar...");
		m_toolbar.add(new Button("Toolbaraction"));

		// _canvas = new DrawCanvas();
		_canvas = new DrawCanvas2(this);
		_canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(_canvas, BorderLayout.CENTER);
		cp.add(m_toolbar, BorderLayout.NORTH);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setTitle("....");
		setVisible(true);

	}

	public JToolBar getToolbar() {
		return m_toolbar;
	}

	public void setToolbar(JToolBar m_toolbar) {
		this.m_toolbar = m_toolbar;
	}

}
