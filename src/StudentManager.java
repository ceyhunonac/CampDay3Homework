public class StudentManager extends UserManager {

    //Override
    public void list(User user) {
        System.out.println("Student listed(Student manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void add(User user) {
        System.out.println("Student added(Student manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void delete(User user) {
        System.out.println("Student deleted(Student manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void update(User user) {
        System.out.println("Student updated(Student manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void joinCourse(Student student) {
        System.out.println("Student has successfully enrolled course(Student manager worked): " + student.getFirstName() + " " + student.getLastName());
    }
}
