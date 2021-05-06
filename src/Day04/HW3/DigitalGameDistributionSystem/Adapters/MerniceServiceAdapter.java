package Day04.HW3.DigitalGameDistributionSystem.Adapters;

import Day04.HW3.DigitalGameDistributionSystem.Abstract.ClientCheckService;
import Day04.HW3.DigitalGameDistributionSystem.Entity.Client;
import Day04.HW3.DigitalGameDistributionSystem.MernisSystem.BBJKPSPublicSoap;
;

public class MerniceServiceAdapter implements ClientCheckService {

    @Override
    public boolean ClientIfRealPerson(Client client)  {
        BBJKPSPublicSoap mernisValidation = new BBJKPSPublicSoap();

        try {
            return mernisValidation.TCKimlikNoDogrula(Long.parseLong(client.getId()), client.getFirstName(), client.getLastName(),client.getDateOfBirth().getYear());
        } catch ( Exception e) {
            System.out.println("Not a valid person");
        }
        return false;
    }

}
