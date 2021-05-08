package Day05.E_Trade_Registration_System.business.concretes;

import Day05.E_Trade_Registration_System.business.abstracts.AuthService;
import Day05.E_Trade_Registration_System.business.abstracts.RegistrationService;
import Day05.E_Trade_Registration_System.business.abstracts.UserService;
import Day05.E_Trade_Registration_System.dataAcces.DaoInterface;
import Day05.E_Trade_Registration_System.entities.User;

public class UserManager implements UserService {
    RegistrationService registrationService;
    AuthService authService;
    DaoInterface daoInterface;

    public UserManager(RegistrationService registrationService, AuthService authService, DaoInterface daoInterface) {
        this.registrationService = registrationService;
        this.authService = authService;
        this.daoInterface = daoInterface;
    }

    @Override
    public void register(User user) {
        for (User user2 : daoInterface.getAll()) {
            if (user2.getEmail().equals(user.getEmail())) {
                System.out.println("This email address is already used");
                return;
            }
        }
        if (authService.isValidInformation(user)) {
            registrationService.register(user);
            daoInterface.add(user);
        } else System.out.println("Enter correct information");
    }

    public void login(String email, String password) {
        if (daoInterface.getAll() == null) return;

        User user2 = daoInterface.getUser(email);
        if (!user2.isVerified()) System.out.println("Verify your account");

        for (User user : daoInterface.getAll()) {
            if (user.getEmail().equals(email)) {
                if (user.getPassword().equals(password)) {
                    System.out.println("Successful login: " + user.getFirstName()+" "+user.getLastName());
                    return;
                }
            }
        }
        System.out.println("Wrong email or password");
    }

    @Override
    public void verifyUser(User user) {
        if (user.getEmail() != null) {
            user.setVerified(true);
            System.out.println("User " + user.getEmail() + " verified");
        } else System.out.println("Error");
    }

    @Override
    public User get(String email) {
        return daoInterface.getUser(email);
    }

    @Override
    public void getAll() {
        System.out.println("Our users");
        for (User user : daoInterface.getAll()) {
            System.out.print(user.getEmail());
            if (user.isVerified())
                System.out.print(" (verified)");
            System.out.println();

        }

    }
}
