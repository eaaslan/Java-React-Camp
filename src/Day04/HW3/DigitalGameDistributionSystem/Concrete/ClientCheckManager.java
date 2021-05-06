package Day04.HW3.DigitalGameDistributionSystem.Concrete;

import Day04.HW3.DigitalGameDistributionSystem.Abstract.ClientCheckService;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Client;

public class ClientCheckManager implements ClientCheckService {
    @Override
    public boolean ClientIfRealPerson(Client Client) {
        return true;
    }
}
