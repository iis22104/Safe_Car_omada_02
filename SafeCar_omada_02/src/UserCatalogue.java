import java.util.ArrayList;
import java.util.List;


public class UserCatalogue {
    private List<user> users;

    public UserCatalogue() {
        this.users = new ArrayList<>();
    }

    public void addUser(user user) {
        users.add(user);
    }

    public void removeUser(String name, String lname) {
        users.removeIf(user -> user.getName().equals(name) && user.getLname().equals(lname));
    }

    public List<user> getAllUsers() {
        return new ArrayList<>(users); 
    }
}
