package objects;

import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseListener;

public interface SimpleShape {

	String getName();

	void draw(Graphics2D g, Point point);
	
	void addMouseListener(MouseListener mListener);
	
}
