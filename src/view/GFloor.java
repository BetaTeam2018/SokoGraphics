package view;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import game.Floor;

public class GFloor extends Drawable{
	
	private Floor floor;
	
	@Override
	public void Draw(JPanel panel) {
		Graphics2D g = (Graphics2D) panel.getGraphics();
		BufferedImage img = View.images.get("floor");
		//*floor.getPos().getX()  //*floor.getPos().getY()
		g.drawImage(img, View.blockSize,  View.blockSize, null);
		
	}
	
	public void setFloor(Floor floor) {
		this.floor = floor;
	}

}
