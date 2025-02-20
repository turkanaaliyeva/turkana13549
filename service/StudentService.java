package service;

import java.util.ArrayList;
import java.util.List;
import model.Student;

public class StudentService {
    private List<Student> students;
    private List<Course> availableCourses;

    public StudentService() {
        this.students = new ArrayList<>();
        this.availableCourses = new ArrayList<>();
    }

    public Student getStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public void enrollStudentInCourse(int studentId, int courseId) {
        Student student = getStudentById(studentId);
        if (student == null) {
            System.err.println("Student not found!");
            return;
        }

        Course course = availableCourses.stream()
                .filter(c -> c.getCourseCode() == courseId)
                .findFirst()
                .orElse(null);

        if (course == null) {
            System.err.println("Course not found!");
            return;
        }

        student.addCourse(course);
        System.out.println("Successfully enrolled in course: " + course.getName());
    }

    public void withdrawStudentFromCourse(int studentId, int courseId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            student.withdrawFromCourse(courseId);
        } else {
            System.err.println("Student not found!");
        }
    }

    public void printStudentInfo(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            System.out.println(student);
        } else {
            System.err.println("Student not found!");
        }
    }

    public float calculateStudentGPA(int studentId) {
        Student student = getStudentById(studentId);
        return (float) (student != null ? student.calculateGPA() : 0.0f);
    }

    public boolean removeStudentById(int studentId) {
        return students.removeIf(student -> student.getId() == studentId);
    }

    public void addAvailableCourse(Course course) {
        availableCourses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
