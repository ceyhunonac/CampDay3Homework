public class Main {
    public static void main(String[] args) {

        Student user1 = new Student();
        user1.setFirstName("Ceyhun");
        user1.setLastName("Onaç");

        Instructor user2 = new Instructor();
        user2.setFirstName("Engin");
        user2.setLastName("Demiroğ");

        User[] users = {user1,user2};
        for(User user:users){
            UserManager userManager1 = new UserManager();
            userManager1.add(user);
            userManager1.list(user);
            userManager1.update(user);
            userManager1.delete(user);
        }

        StudentManager userManager1 = new StudentManager();
        userManager1.add(user1);
        userManager1.joinCourse(user1);

        InstructorManager userManager2 = new InstructorManager();
        userManager2.add(user2);
        userManager2.addCourse(user2);


    }
}