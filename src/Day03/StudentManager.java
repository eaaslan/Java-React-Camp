package Day03;

public class StudentManager extends UserManager {

    @Override
    public void add(User user) {
        System.out.println("Students added");
    }

    public void showStudentCourses(Student student) {
        System.out.println("Show" + student.getFirstName() + " courses");
    }
}
