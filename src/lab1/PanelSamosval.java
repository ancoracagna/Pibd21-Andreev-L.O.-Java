package lab1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelSamosval extends JPanel {
	public static Samosval ship;
	public static boolean initialization = false;
	
	@Override 
	public void paint(Graphics g) { 
		super.paint(g); 
		if(initialization) {
			ship.DrawShip(g);
		}
	}


}
