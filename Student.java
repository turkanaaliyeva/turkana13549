import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends People {
    private double cgpa;
    private String major;
    private List<String> subjects;
    private String email;
    private boolean onProbation;
    private double[] gpas = new double[12];
    private int semester = 1;
    private List<Course> courses;
    private double gpa;
    private String email;
    private List<String> courses;
    private int age;
    private String firstname;
    private String lastname;
    private double newgpa;
    private String phoneNumber;
    private double overallGpa;

    public Student(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects, boolean onProbation, int semester) {
        if (id < 0 || cgpa < 0 || coursesCovered < 0) {
            throw new IllegalArgumentException("Negative values are not allowed for ID, CGPA, or coursesCovered.");
        }
        this.name = name;
        this.id = id;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean addCourse(Course course) {
        if (courses == null) {
            throw new IllegalStateException("Courses list is not initialized.");
        }
        boolean checker = courses.add(course);
        if (checker) {
            System.out.println("Course added successfully!");
        } else {
            System.err.println("Error occurred.");
        }
        return checker;
    }

    public boolean withdrawFromCourse(Course course) {
        if (courses == null) {
            throw new IllegalStateException("Courses list is not initialized.");
        }
        boolean checker = courses.remove(course);
        if (checker) {
            System.out.println("Course deleted successfully!");
        } else {
            System.err.println("Error occurred.");
        }
        return checker;
    }
      
    public void updateSemester(double[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grades array is empty or null.");
        }
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


    public int getCoursesCovered() {
        return coursesCovered;
    }

    public void setCoursesCovered(int coursesCovered) {
        this.coursesCovered = coursesCovered;
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
      
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [cgpa=" + cgpa + ", major=" + major + ", courses=" + courses + ", onProbation=" + onProbation
                + ", gpas=" + Arrays.toString(gpas) + ", semester=" + semester + ", getFullName()=" + getFullName()
                + ", getEmail()=" + getEmail() + ", getID()=" + getId() + "]";
    }

}
