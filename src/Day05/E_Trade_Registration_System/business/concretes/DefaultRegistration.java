package Day05.E_Trade_Registration_System.business.concretes;

import Day05.E_Trade_Registration_System.business.abstracts.RegistrationService;
import Day05.E_Trade_Registration_System.entities.User;

public class DefaultRegistration implements RegistrationService {

    @Override
    public void register(User user) {

        System.out.println("Registration successfully completed! "+user.getFirstName());
        System.out.println("Enter your verification code");
    }

    @Override
    public void login(User user) {
        System.out.println("Succesfull login");
    }

}
