package Day05.E_Trade_Registration_System.core;

import Day05.E_Trade_Registration_System.GoogleRegistration.GoogleRegistration;
import Day05.E_Trade_Registration_System.business.abstracts.RegistrationService;
import Day05.E_Trade_Registration_System.entities.User;

public class GoogleRegistrationAdapter implements RegistrationService {
    GoogleRegistration googleRegistration;

    public GoogleRegistrationAdapter() {
        googleRegistration = new GoogleRegistration();

    }

    @Override
    public void register(User user) {
        googleRegistration.add(user);
        System.out.println("Enter your verification code");
    }

    @Override
    public void login(User user) {
        System.out.println("Successful login with Google");
    }
}

