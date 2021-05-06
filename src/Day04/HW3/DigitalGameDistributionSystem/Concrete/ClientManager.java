package Day04.HW3.DigitalGameDistributionSystem.Concrete;

import Day04.HW3.DigitalGameDistributionSystem.Abstract.ClientCheckService;
import Day04.HW3.DigitalGameDistributionSystem.Abstract.ClientService;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Client;

import java.time.LocalDate;

public class ClientManager implements ClientService {

    ClientCheckService clientCheckService;

    public ClientManager(ClientCheckService clientCheckService) {
        this.clientCheckService = clientCheckService;
    }

    @Override
    public void add(Client[] clients) {

        for (Client client : clients) {
            if (clientCheckService.ClientIfRealPerson(client) && (LocalDate.now().getYear() - client.getDateOfBirth().getYear() >= 18)) {
                System.out.println("User " + client.getId() + " added");
            } else System.out.println("User information must be correct and user must be over 18 years old");
        }
    }

    @Override
    public void update(Client[] clients) {
        for (Client client : clients) System.out.println("User " + client.getId() + " updated");
    }

    @Override
    public void delete(Client[] clients) {
        for (Client client : clients) System.out.println("User " + client.getId() + " deleted");

    }
}
