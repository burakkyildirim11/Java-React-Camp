package javaGameOdev3;

public class Sale {
	
	private int id;
	private String userName;
	private String game;
	private float price;
	private double priceWithCampaign;
	
	
	
	public Sale(int id,String game, float price, double priceWithCampaign) {
		super();
		this.id = id;
		this.game = game;
		this.price = price;
		this.priceWithCampaign = priceWithCampaign;
	}
	
	
	public Sale(int id, String game, float price) {
		super();
		this.id = id;
		this.game = game;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(User user) {
		this.userName = user.getFirstName()+" "+user.getLastName();
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getPriceWithCampaign() {
		return priceWithCampaign;
	}
	public void setPriceWithCampaign(Campaign campaign) {
		this.priceWithCampaign = this.getPrice()-(this.getPrice()*campaign.getCampaignSalesRate())/100;
	}

		
}
