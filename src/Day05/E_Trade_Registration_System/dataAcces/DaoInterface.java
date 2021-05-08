package Day05.E_Trade_Registration_System.dataAcces;

import Day05.E_Trade_Registration_System.entities.User;

import java.util.List;

public interface DaoInterface {

    void add(User user);

    void delete(User user);

    User get(User user);

    User getUser(String email);

    List<User> getAll();
}
