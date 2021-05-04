package javaGameOdev3;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("Burak", "Yildirim", "burak@mail.com", 21);

		UserManager userManager = new UserManager();
		userManager.addUser(user1);

		Campaign amazingSeason = new Campaign(1, "Amazing Season", 30);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(amazingSeason);

		Sale sale1 = new Sale(2, "Counter Strike", 200);
		sale1.setPriceWithCampaign(amazingSeason);
		sale1.setUserName(user1);

		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1);

		System.out.println("**************************************");
		System.out.println("*User -> " + sale1.getUserName());
		System.out.println("*Campaign name -> " + amazingSeason.getCampaignName());
		System.out.println("*Game -> " + sale1.getGame());
		System.out.println("*Price -> " + sale1.getPrice());
		System.out.println("*Discounted Price -> " + sale1.getPriceWithCampaign());
		System.out.println("**************************************");

	}

}
