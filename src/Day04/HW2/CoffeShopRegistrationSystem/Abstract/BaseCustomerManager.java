package Day04.HW2.CoffeShopRegistrationSystem.Abstract;

import Day04.HW2.CoffeShopRegistrationSystem.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomer{

    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to db :"+customer.getNationalityId());
    }
}
