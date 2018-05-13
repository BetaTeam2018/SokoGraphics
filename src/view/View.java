package view;
import java.util.Map;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
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
	 * Előre betöltött képek.
	 */
	public static Map<String, BufferedImage> images;
	public static final int blockSize = 50; //50px * 50px mezőméret
	
	/**
	 * Privát kép betöltő rutin.
	 */
	private BufferedImage loadImg(String path) throws IOException {
		return ImageIO.read(new File(path));			
	}
	
	/**
	 * A konstruktorban töltődnek be a képek.
	 */
	public View() {
		
		try {
			images.put("box1", loadImg("bin\\pictures\\Box_1.png"));			
			images.put("box2", loadImg("bin\\pictures\\Box_2.png"));
			
			//TODO a zössszst be köll olvasni
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
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
