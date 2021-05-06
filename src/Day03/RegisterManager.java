package Day03;

public class RegisterManager {
    UserManager userManager;

    public RegisterManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void add(User user) {
        userManager.add(user);
    }
}
