package futbol;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Silvato extends JPanel {

	
	
	
	
	public Silvato() {
		
		

	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Image imagen= new ImageIcon(Silvato.class.getResource("/futbol/Imagenes/silvato.png")).getImage();
		int x=getWidth()-imagen.getWidth(this);
		int y=getHeight()/2-imagen.getHeight(this);
		g.drawImage(imagen, x, y, this);
		g.setColor(Color.red);
		FontMetrics font= g.getFontMetrics();
		//int xCadena= getWidth()/2 - anchoCadena/2;
		//int yCadena=getHight()/2 +imagen.getHeight(this)/2;
		g.drawString("juego", x, y);
		
	}

}
