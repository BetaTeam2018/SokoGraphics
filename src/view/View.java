package view;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;

import observerPattern.Observable;
import observerPattern.Observer;

public class View implements Observable{
	/**
	 * A panel mely vászonként szolgál
	 */
	private JPanel canvas;
	
	/**
	 * A rajzolható objektumokat tartalmazza.
	 */
	List<Drawable> drawables = new LinkedList<>();
	
	/**
	 * Az értesítendő objektumokat tárolja
	 */
	List<Observer> observers = new LinkedList<>();
	
	
	/**
	 *  Kirajzolja az összes drawable-t.
	 */
	public void update() {
		for (Drawable drawable : drawables) {
			drawable.Draw(canvas);
		}
	}
	
	/**
	 * Jelenttések elküldése
	 */
	@Override
	public void reportToObservers() {
		for (Observer obs : observers) {
			obs.report(this);
		}
		
	}
	
	/**
	 * Megfigyelő feljelelentkeztetése. Többszörös feljelentkezés nem lehetséges.
	 */
	@Override
	public void register(Observer obs) {
		if(! observers.contains(obs))		//csak ha még nincs benne
			observers.add(obs);
	}

	/**
	 * Megfigyelő lejelentkeztetése.
	 */
	@Override
	public void unregister(Observer obs) {
		observers.remove(obs);		
	}
	
}
