public class Instructor extends User {

    public Instructor() {
        System.out.println("The constructor code worked");

    }

    public Instructor(int rank, double instructorRate, int numberOfCourses) {
        this.rank = rank;
        this.instructorRate = instructorRate;
        this.numberOfCourses = numberOfCourses;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getInstructorRate() {
        return instructorRate;
    }

    public void setInstructorRate(double instructorRate) {
        this.instructorRate = instructorRate;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }


    private int rank;
    private double instructorRate;
    private int numberOfCourses;
}
