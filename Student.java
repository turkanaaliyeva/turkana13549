import java.util.List;

public class Student extends Person {

    private int coursesCovered;
    private double cgpa;
    private String major;
    private List<String> subjects;
    private String email;
    private boolean onProbation;
    private double[] gpas = new double[12];
    private int semester = 1;
    private List<Course> courses;

    public Student(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects, boolean onProbation, int semester) {
        if (id < 0 || cgpa < 0 || coursesCovered < 0) {
            throw new IllegalArgumentException("Negative values are not allowed for ID, CGPA, or coursesCovered.");
        }
        this.name = name;
        this.id = id;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;
        this.major = major;
        this.subjects = subjects;
        this.onProbation = onProbation;
        this.semester = semester;
    }

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

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    public void updateSemester(double[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grades array is empty or null.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + " CGPA: " + cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoursesCovered() {
        return coursesCovered;
    }

    public void setCoursesCovered(int coursesCovered) {
        this.coursesCovered = coursesCovered;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public boolean isOnProbation() {
        return onProbation;
    }

    public void setOnProbation(boolean onProbation) {
        this.onProbation = onProbation;
    }

    public double[] getGpas() {
        return gpas;
    }

    public void setGpas(double[] gpas) {
        this.gpas = gpas;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
        this.semester = semester;
    }
}
