package view;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import game.Box;


public class GBox extends Drawable{
	
	private Box box;
	
	@Override
	public void Draw(JPanel panel) {
		Graphics2D g = (Graphics2D) panel.getGraphics();
		BufferedImage img = View.images.get("box");
		if(box.getCurrentField() != null)
			g.drawImage(img, View.blockSize*box.getPos().getX(),  View.blockSize*box.getPos().getY(), null);		
	}
	
	public void setBox(Box box){
		this.box = box;
	}

}