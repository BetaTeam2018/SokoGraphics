package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class JMainMenu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private final int width = 320;
	private final int  height = 300;
	
	private final Dimension btnSize = new Dimension(200, 40);
	private final int interval = btnSize.height + 20;			// Térköz a gombok között
	private final int firstBtnYPos = 80;
	
	private JPanel mainPanel = new JPanel();
	private JLabel lblTitle = new JLabel("Sokoban");
	private JButton btnNewGame;
	private JButton btnLoadGame;
	private JButton btnExit;
	
	/** Label font used for most labels */
	public static final Font SysLabelFontB = new Font("SansSerif", Font.BOLD, 20);
	
	/**
	 * Konstruktor: Menu ablak tualjdonságainak inicializálása
	 */
	public JMainMenu() {
		this.setTitle("Soko - Main Menu");
		this.setSize(width, height);
		this.setLocation(425, 100);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		// Init the main panel
		mainPanel.setSize(width, height);
		mainPanel.setLocation(0, 0);
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.getContentPane().add(mainPanel);

		// Init the title label
		lblTitle.setSize(300, 20);
		lblTitle.setFont(SysLabelFontB);
		lblTitle.setLocation(width/2 - 35, 30);
		mainPanel.add(lblTitle);
		
		
		int multiplier = 0;
		// Create and add the Border demo button
		btnNewGame = new JButton("New Game");
		btnNewGame.setSize(btnSize);
		btnNewGame.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btnNewGame.setLocation(60, firstBtnYPos + multiplier++*interval); 
		btnNewGame.addActionListener(
						new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								// TODO
							}
						});
		mainPanel.add(btnNewGame);
		
		// Create and add the Border demo button
		btnLoadGame = new JButton("Load Game");
		btnLoadGame.setSize(btnSize);
		btnLoadGame.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btnLoadGame.setLocation(60, firstBtnYPos + multiplier++*interval);
		btnLoadGame.addActionListener(
								new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{
										// TODO
									}
								});
		mainPanel.add(btnLoadGame);
		
		// Create and add the Border demo button
		btnExit = new JButton("Exit");
		btnExit.setSize(btnSize);
		btnExit.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btnExit.setLocation(60, firstBtnYPos + multiplier++*interval);
		btnExit.addActionListener(
							new ActionListener()	
							{
									public void actionPerformed(ActionEvent e)	{
										// TODO
									}
									
							});
		mainPanel.add(btnExit);
		
	}
}
