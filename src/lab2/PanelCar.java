package lab2;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelCar extends JPanel{
	public static ITransport ship;
	public static boolean initialization = false;
	
	@Override 
	public void paint(Graphics g) { 
		super.paint(g); 
		if(initialization) {
			ship.DrawCar(g);
		}
	}
}
