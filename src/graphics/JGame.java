package graphics;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel gameBoardPanel;
	
	public JGame() {
		

		this.setTitle("Soko");
		this.setSize(600, 600);
		this.setLocation(425 + 50, 100 + 50);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		
		gameBoardPanel = new JPanel();
		gameBoardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		this.add(gameBoardPanel);
		
	}
}
