package kampjava4;

public class Campaign implements Entity {

	private int id;
	private String campaignName;
	private double discountrate;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, double discountrate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountrate = discountrate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountrate() {
		return discountrate;
	}

	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}
	
}
