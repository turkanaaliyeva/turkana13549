import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String description;
    private int courseCode;
    private int credits;
    private int numberOfStudents;
    private char passingGrade;
    private List<Course> courses = new ArrayList<>();

    public Course() {

    }

    public Course(String name, String description, int courseCode, int credits, int numberOfStudents,
            char passingGrade) {
        this.name = name;
        this.description = description;
        this.courseCode = courseCode;
        this.credits = credits;
        this.numberOfStudents = numberOfStudents;
        this.passingGrade = passingGrade;
    }

    public String toString() {
        return "Course{" + "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", courseCode=" + courseCode +
                ", credits=" + credits +
                ", numberOfStudents=" + numberOfStudents +
                ", passingGrade=" + passingGrade +
                '}';
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourse(List<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getcredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public char getPassingGrade() {
        return passingGrade;
    }

    public void setPassingGrade(char passingGrade) {
        this.passingGrade = passingGrade;
    }

    public List<Course> addCourse(String name, String description, int courseCode, int credits, int numberOfStudents, char passingGrade) {
        Course course = new Course(name, description, courseCode, credits, numberOfStudents, passingGrade);
        courses.add(course);
        System.out.println(courses);
        return courses;
    }

}
