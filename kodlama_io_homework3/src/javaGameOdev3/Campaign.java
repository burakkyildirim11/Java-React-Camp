package javaGameOdev3;

public class Campaign {
	
	private int id;
	private String campaignName;
	private double campaignSalesRate;
	
	
	
	
	public Campaign(int id, String campaignName, double campaignSalesRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignSalesRate = campaignSalesRate;
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
	public double getCampaignSalesRate() {
		return campaignSalesRate;
	}
	public void setCampaignSalesRate(double campaignSalesRate) {
		this.campaignSalesRate = campaignSalesRate;
	}
	
}
