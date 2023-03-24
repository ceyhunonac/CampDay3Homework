public class InstructorManager extends UserManager {

    //Override
    public void list(User user) {
        System.out.println("Instructor listed(Instructor manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void add(User user) {
        System.out.println("Instructor added(Instructor manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void delete(User user) {
        System.out.println("Instructor deleted(Instructor manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void update(User user) {
        System.out.println("Instructor updated(Instructor manager worked): " + user.getFirstName() + " " + user.getLastName());
    }

    public void addCourse(Instructor instructor) {
        System.out.println("Instructor's course has been successfully added to system(Instructor manager worked): " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
