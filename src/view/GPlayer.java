package view;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import game.Direction;
import game.Player;

public class GPlayer extends Drawable{
	
	Player player;

	
	@Override
	public void Draw(JPanel panel) {
		Graphics2D g = (Graphics2D) panel.getGraphics();
		BufferedImage img;
		
		
		if(player.getLastStep() == Direction.UP)
			img = View.images.get("p1Up");
		else
			img = View.images.get("p1Down");
			
			//TODO left, right
		
		g.drawImage(img, View.blockSize*player.getPos().getX(),  View.blockSize*player.getPos().getY(), null);
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
