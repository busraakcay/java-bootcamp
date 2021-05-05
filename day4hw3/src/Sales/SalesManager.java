package Sales;

import Campaigns.Campaign;
import Interfaces.SalesService;
import Users.User;

public class SalesManager implements SalesService{

	@Override
	public void sales(User user, Campaign campaign) {
		System.out.println(user.getName() + " your sales process is successfully completed including " + campaign.getCampaignType());
		
	}

}
