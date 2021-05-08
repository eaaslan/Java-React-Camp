package Day05.E_Trade_Registration_System.business.abstracts;

import Day05.E_Trade_Registration_System.entities.User;

public interface AuthService {

    boolean checkPassword(User user);

    boolean checkEmail(User user);

    boolean checkName(User user);

    boolean isValidInformation(User user);

    boolean userVerification(User user);

}
