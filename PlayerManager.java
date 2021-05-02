package kampjava4;

public class PlayerManager implements PlayerServices{

	ValidationServices validationServices;
	
	public PlayerManager(ValidationServices validationServices) {
		this.validationServices = validationServices;
	}
	public void login(Player player) {
		if (this.validationServices.approve(player).length() < 3) {
			
			System.out.println(player.getFirstName()+"Ba�ar�l� Bir �ekilde Giri� Yapt�n�z");
		} else {
			System.out.println(this.validationServices.approve(player));
		}
	}
		public void register(Player player) {

			System.out.println(player.getFirstName() + " => Kay�t Yap�ld�");

		}

		@Override
		public void exit(Player player) {

			System.out.println(player.getFirstName() + " => ��k�� Yap�ld�!");
		
	}
	
}
