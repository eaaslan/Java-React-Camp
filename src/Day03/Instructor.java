package Day03;


public class Instructor extends User {

    String major;
    String instructorNumber;

    public Instructor() {

    }

    public Instructor(String firstName, String lastName, String age, String id, String major, String instructorNumber) {
        super(firstName, lastName, age, id);
        this.major = major;
        this.instructorNumber = instructorNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
}
