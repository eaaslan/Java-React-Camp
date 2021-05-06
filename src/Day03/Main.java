package Day03;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Enes");
        student.setLastName("Aslan");

        Instructor instructor = new Instructor();
        RegisterManager registerManager = new RegisterManager(new StudentManager());

        registerManager.add(student);
        registerManager.add(instructor);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.showInstructorClassList(instructor);
    }
}
