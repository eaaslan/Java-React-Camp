package Day05.E_Trade_Registration_System.GoogleRegistration;

import Day05.E_Trade_Registration_System.entities.User;

public class GoogleRegistration {

    public void add(User user) {
        System.out.println("User " + user.getFirstName() + " added with Google");
    }

    public User get(User user) {

        return user;
    }

}
