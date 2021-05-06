package Day03;

public class InstructorManager extends UserManager {

    @Override
    public void add(User user) {
        System.out.println("Students added");
    }

    public void showInstructorClassList(Instructor instructor) {
        System.out.println("Show class list");
    }
}
