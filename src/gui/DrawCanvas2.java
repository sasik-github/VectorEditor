package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import objects.PointButton;
import objects.ShapeComponent;
import objects.SimpleShape;

public class DrawCanvas2 extends JPanel implements MouseListener,
		MouseMotionListener {

	private static final long serialVersionUID = -378741836294196543L;

	private static final int BOX = 15;

	private GUI parent;

	private String m_selected = "Point Button";

	private Map m_shapes = new HashMap();

	private SimpleShape m_defaultShape;

	private ActionListener m_reusableActionListener;

	private ShapeComponent m_selectedComponent;

	public DrawCanvas2(GUI parent) {
		this.parent = parent;
		setLayout(null);
		setBackground(Color.BLACK);
		addMouseListener(this);
		SimpleShape shape = new PointButton();
		addShape("Point Button", shape);

	}

	public void selectShape(String name) {
		m_selected = name;
	}

	public SimpleShape getShape(String name) {
		SimpleShape shape = (SimpleShape) m_shapes.get(name);
		if (shape == null) {
			return m_defaultShape;
		}
		return shape;
	}

	public void addShape(String name, SimpleShape shape) {
		m_shapes.put(name, shape);
		JButton button = new JButton(name);
		button.setActionCommand(name);
		button.setToolTipText(name);
		button.addActionListener(m_reusableActionListener);

		if (m_selected == null) {
			button.doClick();
		}

		JToolBar toolbar = parent.getToolbar();
		toolbar.add(button);
		toolbar.validate();
		parent.repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		m_selectedComponent.setBounds(e.getX() - BOX / 2, e.getY() - m_selectedComponent.displacmentX, BOX,
				BOX);
		m_selectedComponent.repaint();
		this.validate();

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Point p = e.getPoint();
		System.out.println("DrawCanvas2.mousePressed() Point = " + p);
		p.y -= ShapeComponent.displacmentX;
		// System.out.println("DrawCanvas2.mousePressed() Point  =" + p);
		Component component = this.getComponentAt(p);
		System.out.println("DrawCanvas2.mousePressed() " + component);
		if (component instanceof ShapeComponent) {
			m_selectedComponent = (ShapeComponent) component;
			this.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
			this.addMouseMotionListener(this);
			m_selectedComponent.repaint();
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (m_selected == null) {
			return;
		}
		if (m_selectedComponent != null) {
			this.removeMouseMotionListener(this);
			this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			m_selectedComponent.setBounds(e.getX() - BOX / 2, e.getY() - m_selectedComponent.displacmentX,
					BOX, BOX);
			m_selectedComponent.repaint();
			m_selectedComponent = null;
			return;

		}
		if (this.contains(e.getX(), e.getY())) {
			ShapeComponent sc = new ShapeComponent(this, m_selected);
			sc.setBounds(e.getX() - BOX / 2, e.getY() - sc.displacmentX, BOX, BOX);
			add(sc, 0);
			validate();
			repaint(sc.getBounds());
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public GUI getParent() {
		return parent;
	}

	public void setParent(GUI parent) {
		this.parent = parent;
	}

}
