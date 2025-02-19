import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person {
    private double cgpa;
    private String major;
    private ArrayList<Course> courses = new ArrayList<>();
    private boolean onProbation;
    private double[] gpas;
    private int semester;

    // Arrays to store additional data
    private double[] semesterGPAs = new double[12]; 
    private String[] completedCourses = new String[20]; 
    private String[] instructors = new String[20];

    // Constructor
    public Student(String fullName, String gender, String phone, String email, int id, int age, 
                   Date dateOfBirth, String major, int semester) {
        super(fullName, gender, phone, email, id, age, dateOfBirth);

        this.major = major;
        this.semester = semester;
        this.cgpa = 0.0;
        this.onProbation = false;
        this.courses = new ArrayList<>();
        this.gpas = new double[12]; // Assuming a maximum of 12 semesters
    }

    // Secondary Constructor (Minimal Info)
    public Student(String fullName, int id, int age,float gpa,  String email) {
        super(fullName, email, age, id);

    }

    

    // Method to Add a Course
    public boolean addCourse(Course course) {
        if (course != null) {
            courses.add(course);
            System.out.println("Course added successfully: " + course.getName());
            return true;
        }
        System.err.println("Error: Course is invalid.");
        return false;
    }

    // Method to Withdraw from a Course
    public boolean withdrawFromCourse(int courseId) {
        boolean removed = courses.removeIf(course -> course.getCourseCode() == courseId);
        if (removed) {
            System.out.println("Course removed successfully!");
            return true;
        }
        System.err.println("Error: Course not found.");
        return false;
    }

    // Inner Class Representing a Course
    public class Course {
        private String name;
        private int courseCode;
        private int credits; // Number of credits for the course
    
        public Course(String name, int courseCode, int credits) {
            this.name = name;
            this.courseCode = courseCode;
            this.credits = credits;
        }
    
        public int getCredits() {
            return credits;
        }
    
        public String getName() {
            return name;
        }
    
        public int getCourseCode() {
            return courseCode;
        }
    }

    // Method to Calculate GPA
    public double calculateGPA() {
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled. GPA is 0.0");
            return 0.0;
        }

        double totalPoints = 0;
        for (Course course : courses) {
            totalPoints += course.getCredits(); // Assuming 'getCredits()' returns the course credit
        }
        double gpa = totalPoints / courses.size();
        this.gpas[this.semester - 1] = gpa; // Store GPA for the current semester
        return gpa;
    }

    // Method to Update the Semester
    public void updateSemester(double[] grades) {
        if (grades == null || grades.length == 0) {
            System.out.println("No grades provided.");
            return;
        }

        double newGpa = Arrays.stream(grades).average().orElse(0.0);
        this.gpas[this.semester - 1] = newGpa;

        // Calculate cumulative GPA
        this.cgpa = ((this.cgpa * (semester - 1)) + newGpa) / semester;
        this.onProbation = this.cgpa < 2.5 && newGpa < 2.5;

        this.semester++;
    }

    // Getters & Setters
    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public ArrayList<Course> getCourses() { return courses; }
    public void setCourses(ArrayList<Course> courses) { this.courses = courses; }

    public boolean isOnProbation() { return onProbation; }
    public void setOnProbation(boolean onProbation) { this.onProbation = onProbation; }

    public double[] getGpas() { return gpas; }
    public void setGpas(double[] gpas) { this.gpas = gpas; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public double[] getSemesterGPAs() { return semesterGPAs; }
    public void setSemesterGPAs(double[] semesterGPAs) { this.semesterGPAs = semesterGPAs; }

    public String[] getCompletedCourses() { return completedCourses; }
    public void setCompletedCourses(String[] completedCourses) { this.completedCourses = completedCourses; }

    public String[] getInstructors() { return instructors; }
    public void setInstructors(String[] instructors) { this.instructors = instructors; }

    // Overridden toString using StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        // Basic student details
        sb.append("Student ID: ").append(getID()).append("\n");
        sb.append("Name: ").append(getFullName()).append("\n");
        sb.append("Major: ").append(major).append("\n");
        sb.append("CGPA: ").append(cgpa).append("\n");
        sb.append("Semester: ").append(semester).append("\n");
        sb.append("Courses Covered: ").append(courses.size()).append("\n");

        // Display enrolled courses
        sb.append("Enrolled Courses: ");
        if (courses.isEmpty()) {
            sb.append("None\n");
        } else {
            for (Course course : courses) {
                sb.append(course.getName()).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()).append("\n"); // Remove last comma
        }

        // Append arrays
        sb.append("Semester GPAs: ").append(Arrays.toString(semesterGPAs)).append("\n");
        sb.append("Completed Courses: ").append(Arrays.toString(completedCourses)).append("\n");
        sb.append("Instructors: ").append(Arrays.toString(instructors)).append("\n");

        // Probation status
        sb.append("On Probation: ").append(onProbation ? "Yes" : "No").append("\n");

        return sb.toString();
    }
}
