package Day02;

import java.util.Date;

public class Course {
    private String courseName;
    private String teacherName;
    private Date startDate;
    private boolean isFree;

    public Course(String courseName, String teacherName, boolean isFree) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.isFree = isFree;
        startDate = new Date();
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", startDate=" + startDate +
                ", isFree=" + isFree +
                '}';
    }
}
