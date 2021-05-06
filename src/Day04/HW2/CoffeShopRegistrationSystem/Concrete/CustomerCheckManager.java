package Day04.HW2.CoffeShopRegistrationSystem.Concrete;

import Day04.HW2.CoffeShopRegistrationSystem.Abstract.CustomerCheckService;
import Day04.HW2.CoffeShopRegistrationSystem.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
