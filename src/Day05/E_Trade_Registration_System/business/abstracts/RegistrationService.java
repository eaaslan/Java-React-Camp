package Day05.E_Trade_Registration_System.business.abstracts;

import Day05.E_Trade_Registration_System.entities.User;

public interface RegistrationService {

    void register(User user);

    void login(User user);

}
