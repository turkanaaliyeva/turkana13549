import java.util.List;

public class Professor {
    private String name;
    private int id;
    private String department;
    private double salary;
    private List<String> coursesTaught;
    private int yearsOfExperience;
    private boolean tenured;
    private double[] ratings = new double[12]; // Ratings from students or administration
    private int semester = 1;

    // Constructor with all attributes
    public Professor(String name, int id, String department, double salary, List<String> coursesTaught, int yearsOfExperience, boolean tenured) {
        if (id < 0 || salary < 0 || yearsOfExperience < 0) {
            System.out.println("Negative values are not allowed for ID, salary, or experience.");
        }
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.coursesTaught = coursesTaught;
        this.yearsOfExperience = yearsOfExperience;
        this.tenured = tenured;
    }

    // Constructor with only name and ID
    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Update professor rating
    public void updateRating(double[] newRatings) {
        if (newRatings == null || newRatings.length == 0) {
            System.out.println("Ratings array is empty or null.");
            return;
        }

        double sum = 0;
        for (double rating : newRatings) {
            sum += rating;
        }
        double newAverageRating = sum / newRatings.length;

        this.ratings[this.semester] = newAverageRating;
    }

    @Override
    public String toString() {
        return "Professor: " + this.name + " | Department: " + this.department + " | Salary: $" + this.salary;
    }

    // Getters and Setters
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isTenured() {
        return tenured;
    }

    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
