package Day04.HW2.CoffeShopRegistrationSystem.Concrete;

import Day04.HW2.CoffeShopRegistrationSystem.Abstract.BaseCustomerManager;
import Day04.HW2.CoffeShopRegistrationSystem.Abstract.CustomerCheckService;
import Day04.HW2.CoffeShopRegistrationSystem.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.CheckIfRealPerson(customer))
            super.save(customer);
        else
            throw new Exception("Not a valid person");
    }


}
