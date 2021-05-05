package Campaigns;

public class Campaign {
	int campaignId;
	String campaignType;
	double campaignAmount;
	
	public Campaign() {
		
	}
	public Campaign(int campaignId, String campaignType, double campaignAmount) {
		super();
		this.campaignId = campaignId;
		this.campaignType = campaignType;
		this.campaignAmount = campaignAmount;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignType() {
		return campaignType;
	}
	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}
	public double getCampaignAmount() {
		return campaignAmount;
	}
	public void setCampaignAmount(double campaignAmount) {
		this.campaignAmount = campaignAmount;
	}
}
