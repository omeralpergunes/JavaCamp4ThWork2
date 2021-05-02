package kampjava4;

public class CampaignManager implements CampaignServices {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ "Mevcut Sisteme Eklenmiþtir. ");
		
		}
	
	   public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"Sistemi Güncellediniz");
	}
	   public void remove(Campaign campaign) {
		   System.out.println(campaign.getCampaignName()+"Sistemden Silindi");
	   }
}
