package Interfaces;

import Campaigns.Campaign;

public interface CampaignService {
	void addCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
}
