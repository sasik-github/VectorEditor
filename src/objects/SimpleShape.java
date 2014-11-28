package objects;

import java.awt.Container;
import java.awt.Graphics2D;

public interface SimpleShape {

	String getName();

	void draw(Graphics2D g, Container parent);
}
