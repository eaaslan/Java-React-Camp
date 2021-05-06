package Day04.HW2.CoffeShopRegistrationSystem.Adapters;

import Day04.HW2.CoffeShopRegistrationSystem.Abstract.CustomerCheckService;
import Day04.HW2.CoffeShopRegistrationSystem.Entities.Customer;
import Day04.HW2.CoffeShopRegistrationSystem.MernisService.ETGKPSPublicSoap;

import java.rmi.RemoteException;

public class MerniceServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
       ETGKPSPublicSoap mernisValidation = new ETGKPSPublicSoap();

        try {
            return mernisValidation.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch ( Exception e) {
            System.out.println("Not a valid person");
        }
        return false;
    }
}
