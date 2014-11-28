package vectoreditor;

import javax.swing.SwingUtilities;

import gui.GUI;

public class VectorEditor {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new GUI();
			}
		});
	}

}
