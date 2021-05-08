package Day05.E_Trade_Registration_System.business.abstracts;

import Day05.E_Trade_Registration_System.entities.User;

public interface UserService {


    void register(User user);

    void login(String email, String password);

    void verifyUser(User user);

    User get(String email);

    void getAll();

}
