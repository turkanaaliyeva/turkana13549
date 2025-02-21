package service;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public Course findCourseByCode(int courseCode) {
        return courses.stream().filter(c -> c.getCourseCode() == courseCode).findFirst().orElse(null);
    }

    public void removeCourse(int courseCode) {
        courses.removeIf(c -> c.getCourseCode() == courseCode);
    }
}
