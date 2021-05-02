package kampjava4;

public class PlayerManager implements PlayerServices{

	ValidationServices validationServices;
	
	public PlayerManager(ValidationServices validationServices) {
		this.validationServices = validationServices;
	}
	public void login(Player player) {
		if (this.validationServices.approve(player).length() < 3) {
			
			System.out.println(player.getFirstName()+"Baþarýlý Bir Þekilde Giriþ Yaptýnýz");
		} else {
			System.out.println(this.validationServices.approve(player));
		}
	}
		public void register(Player player) {

			System.out.println(player.getFirstName() + " => Kayýt Yapýldý");

		}

		@Override
		public void exit(Player player) {

			System.out.println(player.getFirstName() + " => Çýkýþ Yapýldý!");
		
	}
	
}
