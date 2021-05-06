package Day04.HW3.DigitalGameDistributionSystem.Concrete;

import Day04.HW3.DigitalGameDistributionSystem.Abstract.CampaignService;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign[] campaigns) {
        for (Campaign campaign : campaigns)
            System.out.println("Campaign " + campaign.getName() + " added");
    }

    @Override
    public void update(Campaign[] campaigns) {
        for (Campaign campaign : campaigns)
            System.out.println("Campaign " + campaign.getName() + " updated");
    }

    @Override
    public void delete(Campaign[] campaigns) {
        for (Campaign campaign : campaigns)
            System.out.println("Campaign " + campaign.getName() + " deleted");
    }
}
