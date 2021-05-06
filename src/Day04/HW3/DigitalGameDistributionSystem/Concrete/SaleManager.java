package Day04.HW3.DigitalGameDistributionSystem.Concrete;

import Day04.HW3.DigitalGameDistributionSystem.Abstract.SaleService;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Campaign;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Client;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Game;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Sale;

public class SaleManager implements SaleService {


    @Override
    public void add(Sale s) {
        Game game = s.getGame();
        Client client = s.getClient();
        if (s.getCampaign() != null) { // if campaign is not empty then calculate the discounted price and print
            Campaign campaign = s.getCampaign();
            double salePrice = (game.getPrice() * (100.0 - campaign.getDiscountRate())) / 100;
            System.out.println("User " + client.getId() + " bought the " + game.getName() + " game for $" + salePrice + " with " + campaign.getName());
        } else {
            System.out.println("User " + client.getId() + " bought the " + game.getName() + " game for $" + game.getPrice());
        }
    }

    @Override
    public void update(Sale a) {

        System.out.println("User "+a.getGame()+ "updated order");

    }

    @Override
    public void delete(Sale a) {

        System.out.println("User "+a.getGame()+ "deleted order");
    }
}
