package Day04.HW2.CoffeShopRegistrationSystem;

import Day04.HW2.CoffeShopRegistrationSystem.Abstract.BaseCustomerManager;
import Day04.HW2.CoffeShopRegistrationSystem.Adapters.MerniceServiceAdapter;
import Day04.HW2.CoffeShopRegistrationSystem.Concrete.CustomerCheckManager;
import Day04.HW2.CoffeShopRegistrationSystem.Concrete.NeroCustomerManager;
import Day04.HW2.CoffeShopRegistrationSystem.Concrete.StarbucksCustomerManager;
import Day04.HW2.CoffeShopRegistrationSystem.Entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
        BaseCustomerManager customerManager1 = new NeroCustomerManager(new CustomerCheckManager());

        customerManager.save(new Customer(1, "Enes Alp", "Aslan", new Date(1998, 1, 15), "400126534"));
        customerManager1.save(new Customer(2, "Alp", "Aslan", new Date(1998, 1, 15), "22345"));

    }
}
