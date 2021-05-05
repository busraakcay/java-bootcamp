package GameSimulation;

import Campaigns.Campaign;
import Campaigns.CampaignManager;
import Sales.Sales;
import Sales.SalesManager;
import Users.User;
import Users.UserManager;


public class Main {

	public static void main(String[] args) {
		User user = new User(1, "123456789", "Büþra", "Akçay", "20.03.1998");
		Sales sales = new Sales(1, "first sale");
		Campaign campaign = new Campaign();
		campaign.setCampaignType("discount");
		
		UserManager uManager = new UserManager();
		uManager.signUp(user);
		
		CampaignManager cManager = new CampaignManager(sales);
		cManager.addCampaign(campaign);
		
		SalesManager sManager = new SalesManager();
		sManager.sales(user,campaign);
		
		


	}

}
