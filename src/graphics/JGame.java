package graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;

public class JGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel gameBoardPanel = new JPanel();
	
	//TODO input fájl a menüben lévő comobox alapján
	private Controller cnt;
	
	public JGame() {
		this.setTitle("Soko");
		this.setSize(655, 680);
		this.setLocation(425 + 50, 100 + 50);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);			
		
		//gameBoardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		this.add(gameBoardPanel);
		
		cnt = new Controller("bin\\maps\\test.txt", gameBoardPanel);
		this.addKeyListener(cnt);
	}
}
