package Day05.E_Trade_Registration_System.business.concretes;

import Day05.E_Trade_Registration_System.business.abstracts.AuthService;
import Day05.E_Trade_Registration_System.entities.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthManager implements AuthService {

    @Override
    public boolean checkPassword(User user) {

        return user.getPassword().length() >= 6;
    }

    @Override
    public boolean checkEmail(User user) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        String email = user.getEmail();
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
//        for (int i = 0; i < user.getEmail().length(); i++) {
//            if (user.getEmail().charAt(i) == '@') return true;
//        }
//        return false;
    }

    @Override
    public boolean checkName(User user) {
        return user.getFirstName().length() >= 2 && user.getLastName().length() >= 2;
    }

    @Override
    public boolean isValidInformation(User user) {
        return checkPassword(user) && checkEmail(user) && checkName(user);
    }

    @Override
    public boolean userVerification(User user) {
        user.setVerified(true);
        return true;
    }

}


