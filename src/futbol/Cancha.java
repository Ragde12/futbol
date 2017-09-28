package futbol;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Cancha extends JPanel {

	/**
	 * Create the panel.
	 */
	public Cancha() {

	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//Image imagen= new ImageIcon(Silvato.class.getResource("/futbol/Imagenes/cancha.png")).getImage();
		//int x=getWidth()-imagen.getWidth(this);
		//int y=getHeight()/2-imagen.getHeight(this);
		Image imagen= new ImageIcon(Silvato.class.getResource("/futbol/Imagenes/cancha.png")).getImage();
		int x=getWidth()-imagen.getWidth(this);
		int y=getHeight()/2-imagen.getHeight(this);
	}

}


