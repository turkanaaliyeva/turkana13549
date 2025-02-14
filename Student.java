import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends People {
    private double cgpa;
    private String major;
    private List<String> subjects; 
    private boolean onProbation; 
    private double[] gpas = new double[12];
    private int semester = 1;
    private double gpa;
    private String email;
    private List<String> courses;
    private int age;
    private String firstname;
    private String lastname;
    private double newgpa;
    private String phoneNumber;
    private double overallGpa;
    




    Student(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects, boolean onProbation, int semester) {
        if (id < 0|| cgpa < 0 || coursesCovered < 0) {
            System.out.println("Negative values are not allowed for ID, GPA, CGPA, or coursesCovered.");
        }
        this.name = name;
        this.id = id;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;

    private List<Course> courses;
    private boolean onProbation;
    private double[] gpas;
    private int semester;


    public Student(String fullName, String gender, String phone, String email, int age, int Id, 
                   Date dateOfBirth, String major, int semester) {
        super(fullName, gender, phone, email,Id, age, dateOfBirth);
        this.major = major;
        this.semester = semester;
        this.cgpa = 0.0;
        this.onProbation = false;
        this.courses = new ArrayList<>();
        this.gpas = new double[12]; // Assuming max 12 semesters
    }


   


    public Student(String fullName, int Id, float gpa, int age, String email) {
        super(fullName, Id, age, email);


    }





    // Add Course
    public boolean addCourse(Course course) {
        if (course != null) {
            courses.add(course);
            System.out.println("Course added successfully: " + course.getName());
            return true;
        }
        System.err.println("Error: Course is invalid.");
        return false;
    }

    // Withdraw from Course
    public boolean withdrawFromCourse(int courseId) {
        boolean removed = courses.removeIf(course -> course.getCourseCode() == courseId);
        if (removed) {
            System.out.println("Course removed successfully!");
            return true;
        }
        System.err.println("Error: Course not found.");
        return false;
    }

    // Calculate GPA
    public double calculateGPA() {
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled. GPA is 0.0");
            return 0.0;
        }

        double totalPoints = 0;
        for (Course course : courses) {
            totalPoints += course.getcredits();  //find the credit of course
        }
        double gpa = totalPoints / courses.size();
        this.gpas[this.semester - 1] = gpa; // Store GPA for the current semester
        return gpa;
    }

    // Update Semester
    public void updateSemester(double[] grades) {
        if (grades == null || grades.length == 0) {
            System.out.println("No grades provided.");
            return;
        }

        double newGpa = 0;
        for (double grade : grades) {
            newGpa += grade;
        }
        newGpa /= grades.length;

        this.gpas[this.semester - 1] = newGpa;
        this.cgpa = (this.cgpa * semester + newGpa) / (semester + 1);
        this.onProbation = this.cgpa < 2.5 && newGpa < 2.5;
        this.semester++;
    }

    // Getters & Setters


    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public List<Course> getCourses() { return courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }

    public boolean isOnProbation() { return onProbation; }
    public void setOnProbation(boolean onProbation) { this.onProbation = onProbation; }

    public double[] getGpas() { return gpas; }
    public void setGpas(double[] gpas) { this.gpas = gpas; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }


    @Override
    public String toString() {
        return "Student [cgpa=" + cgpa + ", major=" + major + ", courses=" + courses + ", onProbation=" + onProbation
                + ", gpas=" + Arrays.toString(gpas) + ", semester=" + semester + ", getFullName()=" + getFullName()
                + ", getEmail()=" + getEmail() + ", getID()=" + getId() + "]";
    }

}
