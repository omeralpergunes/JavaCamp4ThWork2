package kampjava4;

public class GameManager implements GameServices {
	
	
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+"... Oyun Eklenmi�tir");
	}
	public void update(Game game) {
		System.out.println(game.getName() +"... Oyun G�ncellendi");
	}
	public void remove(Game game) {
		System.out.println(game.getName() +"... Oyun Silindi" );
	}

	
}
