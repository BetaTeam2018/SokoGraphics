package view;
import javax.swing.JPanel;

/** 
 * Rajzolhat� oszt�lyok interf�sze.
 */
public interface Drawable extends Comparable<Drawable>{
	public void Draw(JPanel panel);		
}