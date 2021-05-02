package kampjava4;

public class Main {

	public static void main(String[] args) {

		PlayerManager playerManager = new PlayerManager(new ValidationManager());
		Player player1 = new Player(2, "Ömer Alper", "Güneş", "46545654",19); 
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 =  new Campaign(2, "Bahar Ayı Fırsatları",120);
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(3, "FIFA 2021",267);
		
		System.out.println("Oyunları Yazalım");
		System.out.println("Başka bir oyun");
		
		System.out.println();
		campaignManager.add(campaign1);
		
		System.out.println();
		playerManager.register(player1);
		
		System.out.println();
		playerManager.login(player1);
		
		gameManager.add(game1);
		System.out.println();
		
	}
	
	
	

}
