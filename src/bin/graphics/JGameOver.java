package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class JGameOver extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final Font SysLabelFontB = new Font("SansSerif", Font.BOLD, 20);
	
	private final int width = 320;
	private final int  height = 300;

	JFrame  frame=this;
	JButton saveExit;
	JPanel mainPanel;
	double p1Points;
	double p2Points;
	JLabel player1Label;
	JLabel player2Label;
	JLabel winLabel;
	
	
	
	public JGameOver(double p1Points, double p2Points)
	{
		this.p1Points=p1Points;
		this.p2Points=p2Points;
		this.setSize(width, height);
		this.setLocation(425, 100);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mainPanel=new JPanel(new BorderLayout());
		mainPanel.setSize(width,height);
		mainPanel.setLocation(0, 0);
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.getContentPane().add(mainPanel);
		
		player1Label=new JLabel("Player 1:  "+p1Points+"  points");
		player2Label=new JLabel("Player 2:  "+p2Points+"  points");
		if(this.p1Points>this.p2Points)
			winLabel=new JLabel("Player 1 wins!");
		else if(this.p2Points>this.p1Points)
			winLabel=new JLabel("Player 2 wins!");
		else
			winLabel=new JLabel("Draw!");
		
		
		winLabel.setSize(300, 20);
		winLabel.setFont(SysLabelFontB);
		winLabel.setLocation(new Point(90,50));
		
		player1Label.setSize(300, 20);
		player1Label.setFont(SysLabelFontB);
		player1Label.setLocation(new Point(60,100));
		
		player2Label.setSize(300, 20);
		player2Label.setFont(SysLabelFontB);
		player2Label.setLocation(new Point(60,150));
		

		
		mainPanel.add(player1Label);
		mainPanel.add(player2Label);
		mainPanel.add(winLabel);
		
		
		
		
	}
	
}
