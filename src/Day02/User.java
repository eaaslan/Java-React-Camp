package Day02;
import java.util.ArrayList;

public class User {
    String username;
    String email;
    String password;
    ArrayList<Course> registeredCourses;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        registeredCourses = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", registeredCourses=" + registeredCourses +
                '}';
    }
}