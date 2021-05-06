package Day02;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("C# + ANGULAR", "Engin Demirog", true);
        Course course2 = new Course("JAVA + REACT", "Engin Demirog", true);
        Course course3 = new Course("INTRODUCTION TO PROGRAMMING", "Engin Demirog", true);

        User user = new User("enesalp", "enesalp@gmail.com", "123456789");

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(user, course1);
        courseManager.addCourse(user, course2);
        courseManager.addCourse(user, course3);

        courseManager.showYourCourse(user);

        Course[] courses = {course1, course2, course3};

        for (Course course : courses) {
            System.out.println(course.toString());
        }

    }
}