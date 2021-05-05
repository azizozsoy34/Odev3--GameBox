package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " add");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " delete");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " update");
		
	}

}
