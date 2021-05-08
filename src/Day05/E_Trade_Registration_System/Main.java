package Day05.E_Trade_Registration_System;

import Day05.E_Trade_Registration_System.business.abstracts.AuthService;
import Day05.E_Trade_Registration_System.business.concretes.AuthManager;
import Day05.E_Trade_Registration_System.business.concretes.DefaultRegistration;
import Day05.E_Trade_Registration_System.business.concretes.UserManager;
import Day05.E_Trade_Registration_System.core.GoogleRegistrationAdapter;
import Day05.E_Trade_Registration_System.dataAcces.Dao;
import Day05.E_Trade_Registration_System.dataAcces.DaoInterface;
import Day05.E_Trade_Registration_System.entities.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("Enes", "Aslan", "enes@gmail.com", "123456");
        User user2 = new User("Doganer", "Kobak", "doganer@gmail.com", "trol1234");
        User user3 = new User("Berkcan", "Sengul", "berkcan@gmail.com", "trol1234");

        DaoInterface daoInterface = new Dao();
        AuthService authService = new AuthManager();

        UserManager userManager = new UserManager(new GoogleRegistrationAdapter(), authService, daoInterface);
        UserManager userManager2 = new UserManager(new DefaultRegistration(), authService, daoInterface);

        userManager.register(user); // we save user our database with different registration service
        userManager.verifyUser(user); // you must verify account to login
        System.out.println("----------------------------------------");
        userManager.register(user2);
        System.out.println("----------------------------------------");
        userManager2.register(user3);
        userManager2.verifyUser(user3);

        System.out.println("----------------------------------------");
        userManager.login("enes@gmail.com", "123456");
        System.out.println("----------------------------------------");
        userManager.getAll(); // if users get verified show like this (verified)
        System.out.println("----------------------------------------");
    }
}
