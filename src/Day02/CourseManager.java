package Day02;

public class CourseManager {


    void addCourse(User user, Course course) {
        user.registeredCourses.add(course);
    }

    void showYourCourse(User user) {
        System.out.println(user.registeredCourses);
    }

}