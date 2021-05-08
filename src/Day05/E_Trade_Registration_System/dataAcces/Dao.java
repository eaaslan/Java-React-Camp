package Day05.E_Trade_Registration_System.dataAcces;

import Day05.E_Trade_Registration_System.entities.User;

import java.util.ArrayList;
import java.util.List;

public class Dao implements DaoInterface {
    List<User> arrayList;

    public Dao() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void add(User user) {
        arrayList.add(user);
    }

    @Override
    public void delete(User user) {
    }

    @Override
    public User get(User user) {

        return user;
    }

    @Override
    public User getUser(String email) {
        for (User user : arrayList) {
            if (user.getEmail().equals(email))
                return user;
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return arrayList;
    }
}
