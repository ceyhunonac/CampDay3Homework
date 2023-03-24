public class UserManager {

    public void list(User user) {
        System.out.println("User listed(Default manager worked): " + user.getFirstName());
    }

    public void add(User user) {
        System.out.println("User added(Default manager worked): " + user.getFirstName());
    }

    public void delete(User user) {
        System.out.println("User deleted(Default manager worked): " + user.getFirstName());
    }

    public void update(User user) {
        System.out.println("User updated(Default manager worked): " + user.getFirstName());
    }


}
