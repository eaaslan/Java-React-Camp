package Day04.HW2.CoffeShopRegistrationSystem.Abstract;

import Day04.HW2.CoffeShopRegistrationSystem.Entities.Customer;

import java.rmi.RemoteException;

public interface CustomerCheckService {

    boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
