package service;

import java.util.ArrayList;
import java.util.List;
import model.Student;

public class AdminService {
    private List<Course> courses;
    private StudentService studentService;

    public AdminService(StudentService studentService) {
        this.courses = new ArrayList<>();
        this.studentService = studentService;
    }

    public void addStudent(String name, int id, int age, float gpa, String email) {
        if (studentService.getStudentById(id) != null) {
            System.err.println("Student with this ID already exists!");
            return;
        }
        Student student = new Student(name, id, age, gpa, email);
        studentService.addStudent(student);
        System.out.println("Student added successfully: " + student.getFullName());
    }

    public void addCourse(String name, String description, int courseCode, int creditScore, int numberOfStudents, char passingGrade) {
        if (courses.stream().anyMatch(c -> c.getCourseCode() == courseCode)) {
            System.err.println("Course with this code already exists!");
            return;
        }
        Course course = new Course(name, description, courseCode, creditScore, numberOfStudents, passingGrade, null, null, null);
        courses.add(course);
        studentService.addAvailableCourse(course);
        System.out.println("Course added successfully: " + course.getName());
    }

    public void removeStudent(int studentId) {
        if (studentService.removeStudentById(studentId)) {
            System.out.println("Student removed successfully!");
        } else {
            System.err.println("Student not found!");
        }
    }
}
