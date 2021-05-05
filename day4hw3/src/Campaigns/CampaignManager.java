package Campaigns;

import Interfaces.CampaignService;
import Sales.Sales;

public class CampaignManager implements CampaignService{

	public CampaignManager(Sales sales) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Campaign has been added");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Campaign has been updated");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign has been added");
		
	}
}
