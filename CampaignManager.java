package kampjava4;

public class CampaignManager implements CampaignServices {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ "Mevcut Sisteme Eklenmi�tir. ");
		
		}
	
	   public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"Sistemi G�ncellediniz");
	}
	   public void remove(Campaign campaign) {
		   System.out.println(campaign.getCampaignName()+"Sistemden Silindi");
	   }
}
