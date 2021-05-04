package javaGameOdev3;

public class CampaignManager  implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+" added successfully!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+" deleted successfully!");
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+" updated successfully!");
		
	}
	
	
}
