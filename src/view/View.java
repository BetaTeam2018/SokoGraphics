package view;

import java.util.Collections;
import java.util.List;
import javax.swing.JPanel;

import observerPattern.Observable;
import observerPattern.Observer;

public class View implements Observer{
	/**
	 * A panel mely vászonként szolgál
	 */
	private JPanel canvas;
	
	/**
	 * A rajzolható objektumokat tartalmazza.
	 */
	private List<Drawable> drawables;	
		
	/**
	 * Rajzolható objektum lista átadása.
	 * @param list
	 */
	public void set(List<Drawable> list) {
		drawables = list;
		Collections.sort(drawables); // rendezzés rajzolási sorrend szerint
	}
	
	/**
	 * A JPanel átadása. Ide fog rajzolni.
	 * @param panel
	 */
	public void set(JPanel panel) {
		canvas = panel;
	}
	
	/**
	 *  Kirajzolja az összes drawable-t.
	 */
	public void update() {
		for (Drawable drawable : drawables) {
			drawable.Draw(canvas);
		}
	}
		
	
	/**
	 * A megfigyelt objektumoktól kapott értesítés.
	 */
	@Override
	public void report(Observable o) {
		update();		
	}
	
}
