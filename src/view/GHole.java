package view;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import game.Hole;

public class GHole extends Drawable{
	
	private Hole hole;
	
	@Override
	public void Draw(JPanel panel) {
		Graphics2D g = (Graphics2D) panel.getGraphics();
		BufferedImage img = View.images.get("hole");
		g.drawImage(img, View.blockSize*hole.getPos().getX(),  View.blockSize*hole.getPos().getY(), null);
		
	}
	
	public void setHole(Hole hole) {
		this.hole = hole;
	}

}