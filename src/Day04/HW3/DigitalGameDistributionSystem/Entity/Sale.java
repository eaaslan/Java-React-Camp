package Day04.HW3.DigitalGameDistributionSystem.Entity;

public class Sale {

    private Game game;
    private Client client;
    private Campaign campaign; // multiple campaigns are not supported

    public Sale(Game game, Client client, Campaign campaign) {
        this.game = game;
        this.client = client;
        this.campaign = campaign;
    }

    public Sale(Game game, Client client) { // without campaign
        this.game = game;
        this.client = client;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
