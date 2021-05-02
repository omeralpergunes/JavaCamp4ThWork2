package kampjava4;

public class GameManager implements GameServices {
	
	
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+"... Oyun Eklenmiþtir");
	}
	public void update(Game game) {
		System.out.println(game.getName() +"... Oyun Güncellendi");
	}
	public void remove(Game game) {
		System.out.println(game.getName() +"... Oyun Silindi" );
	}

	
}
