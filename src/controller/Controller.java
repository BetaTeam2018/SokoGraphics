package controller;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;

import game.*;
import proto.MapLoader;
import view.View;

public class Controller implements KeyListener{
	/**
	 * A betöltendő pálya elérési útja.
	 */
	String filePath;
	
	/**
	 * A játék modell része
	 */
	Game g = new Game();
	
	/**
	 * A játék grafikus (view) része
	 */
	View v = new View();
	
	/**
	 * A játék objektumainak fájból való betöltéséhez.
	 */
	MapLoader ml = new MapLoader();
	
	/**
	 * A játékosok.
	 */
	List<Player> players;
	
	
	public Controller(String mapPath) {
		filePath = mapPath;
				
		InputStream is = null;
		try {
			is = new FileInputStream(new File(filePath)); //fájl megnyitása
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		ml.Load(is);								//pálya betöltése és a szükséges változók beállítása
		players = ml.getPlayers();
		g.setMaze(ml.getFields());
		v.set(ml.getDrawables()); 	//TODO v.set metódus még nincs implementálva

		
		for (Player p : players)					//játékosoknak a pálya átadása
			p.setGame(g);		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();		
		
		switch(keyCode) {
			case KeyEvent.VK_UP:
				players.get(0).step(Direction.UP);
				break;
			
			case KeyEvent.VK_DOWN:
				players.get(0).step(Direction.DOWN);
				break;
			
			case KeyEvent.VK_LEFT:
				players.get(0).step(Direction.LEFT);
				break;
				
			case KeyEvent.VK_RIGHT:
				players.get(0).step(Direction.RIGHT);
				break;
			
			case KeyEvent.VK_W:
				players.get(1).step(Direction.UP);
				break;
				
			case KeyEvent.VK_S:
				players.get(1).step(Direction.DOWN);
				break;
				
			case KeyEvent.VK_A:
				players.get(1).step(Direction.LEFT);
				break;
				
			case KeyEvent.VK_D:
				players.get(1).step(Direction.RIGHT);
				break;
				
			//Player0 alatti padló súrlódása
			case KeyEvent.VK_0:
				players.get(0).setFriction(Friction.OIL);
				break;
				
			case KeyEvent.VK_1:
				players.get(0).setFriction(Friction.NORMAL);
				break;
				
			case KeyEvent.VK_2:
				players.get(0).setFriction(Friction.HONEY);
				break;
			default:
						// Érvénytelen bill.
				break;
}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {		
		
	}
	
	public View getView() {
		return v;
	}

	
	
}
