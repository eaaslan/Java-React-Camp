package Day04.HW3.DigitalGameDistributionSystem;

import Day04.HW3.DigitalGameDistributionSystem.Adapters.MerniceServiceAdapter;
import Day04.HW3.DigitalGameDistributionSystem.Concrete.*;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Campaign;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Client;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Game;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Sale;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("454645645", "Enes Alp", "Aslan", new Date(1998, 5, 16));
        Client client2 = new Client("1234567890", "Doğaner", "Kobak", new Date(1999, 11, 24));
        Client client3 = new Client("23526167", "Bugra Barıs", "Osma", new Date(2005, 11, 24));
        Client[] clients = {client, client2, client3};
        ClientManager clientManager = new ClientManager(new ClientCheckManager());
//       ClientManager clientManager = new ClientManager(new MerniceServiceAdapter());
        clientManager.add(clients);
        System.out.println("--------------------------------------");
        Game game = new Game(421, "Bioshock", 20);
        Game game2 = new Game(279, "Dishonored", 30);
        Game game3 = new Game(521, "Hades", 10);
        Game[] games = {game, game2, game3};
        GameManager gameManager = new GameManager();
        gameManager.add(games);
        System.out.println("--------------------------------------");
        Campaign campaign = new Campaign(24, "Winter Sales", 30);
        Campaign campaign2 = new Campaign(24, "Summer Sales", 40);
        Campaign campaign3 = new Campaign(24, "Halloween Sales", 25);
        Campaign[] campaigns = {campaign, campaign2, campaign3};
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaigns);
        System.out.println("--------------------------------------");
        Sale sale1 = new Sale(game, client);
        Sale sale2 = new Sale(game2, client2, campaign);
        Sale sale3 = new Sale(game3, client3, campaign2);
        Sale[] sales = {sale1, sale2, sale3};

        SaleManager saleManager = new SaleManager();
        for (Sale sale : sales)
            saleManager.add(sale);

    }
}
