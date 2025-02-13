import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public ArrayList<Student> students;
    private Scanner sc;
    private ArrayList<Course> availableCourses;

    public StudentService() {
        this.students = new ArrayList<>();
        this.sc = new Scanner(System.in);
        this.availableCourses = new ArrayList<>();
    }

    

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        System.err.println("Student not found!");
        return null;
    }

    public void enrollStudentInCourse(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            if (availableCourses.isEmpty()) {
                System.out.println("No available courses to enroll in.");
                return;
            }
            System.out.println("Available courses:");
            for (int i = 0; i < availableCourses.size(); i++) {
                System.out.println((i + 1) + ". " + availableCourses.get(i).getName());
            }
            System.out.print("Choose a course number to enroll: ");
            int choice = sc.nextInt();
            if (choice > 0 && choice <= availableCourses.size()) {
                student.addCourse(availableCourses.get(choice - 1));
                System.out.println("Successfully enrolled in the course!");
            } else {
                System.err.println("Invalid choice!");
            }
        }
    }

    public void withdrawStudentFromCourse(int studentId, int courseId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            student.withdrawFromCourse(courseId);
        }
    }

    public void printStudentInfo(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            student.toString();
        }
    }

    public float calculateStudentGPA(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            return (float) student.calculateGPA();
        }
        return 0.0f;
    }

    public boolean removeStudentById(int studentId) {
        return students.removeIf(student -> student.getId() == studentId);
    }

    public void addAvailableCourse(Course course) {
        availableCourses.add(course);
    }
}

class AdminService {
    private ArrayList<Course> courses;
    private StudentService studentService;
    private Scanner sc;

    public AdminService(StudentService studentService) {
        this.courses = new ArrayList<>();
        this.studentService = studentService;
        this.sc = new Scanner(System.in);
    }
    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter student GPA: ");
        float gpa = sc.nextFloat();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student email: ");
        String email = sc.next();
        
        Student student = new Student(name, id, gpa, age, email);
        studentService.students.add(student);
        System.out.println("Student added successfully!");
    }

    public void addCourse() {
     
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();
        System.out.println("Enter the description");
        String description = sc.nextLine();
        System.out.print("Enter course code: ");
int courseCode = sc.nextInt();
        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();
        System.out.println("Enter the max number of Students");
int numberOfStudents = sc.nextInt();
        System.out.print("Enter grade: ");

        char passingGrade = sc.next().charAt(0);
       
        Course course = new  Course(courseName, description, courseCode, creditScore, numberOfStudents,passingGrade );
        courses.add(course);
        studentService.addAvailableCourse(course);
        System.out.println("Course added successfully!");
    }
    public void removeStudent(int studentId) {
        if (studentService.removeStudentById(studentId)) {
            System.out.println("Student removed successfully!");
        } else {
            System.err.println("Student not found!");
        }
    }
}