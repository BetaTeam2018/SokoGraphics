package controller;

import game.Game;
import proto.MapLoader;
import view.View;

public class Controller {
	
	/**
	 * A játék modell része
	 */
	Game g = new Game();
	
	/**
	 * A játék grafikus (view) része
	 */
	View v = new View();
	
	MapLoader ml = new MapLoader();
	
	
}
