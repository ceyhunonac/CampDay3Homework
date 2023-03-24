public class Student extends User {

    public Student() {
        System.out.println("The constructor code worked");
    }

    public Student(int numberOfCourseCompleted) {
        this.numberOfCourseCompleted = numberOfCourseCompleted;
    }

    public int getNumberOfCourseCompleted() {
        return numberOfCourseCompleted;
    }

    public void setNumberOfCourseCompleted(int numberOfCourseCompleted) {
        this.numberOfCourseCompleted = numberOfCourseCompleted;
    }

    private int numberOfCourseCompleted;
}
