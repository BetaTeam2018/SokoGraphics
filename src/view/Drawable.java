package view;
import javax.swing.JPanel;

/** 
 * Rajzolható osztályok interfésze.
 */
public interface Drawable extends Comparable<Drawable>{
	public void Draw(JPanel panel);		
}