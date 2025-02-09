import java.util.List;

public class Student {
    String name;
    int id; 
    double gpa; 
    int coursesCovered;
    double cgpa; 
    String major;
    List<String> subjects; 
    boolean onProbation; 

    Student(String name, int id, double gpa, int coursesCovered, double cgpa, String major, List<String> subjects, boolean onProbation) {
        if (id < 0 || gpa < 0 || cgpa < 0 || coursesCovered < 0) {
            System.out.println("Negative values are not allowed for ID, GPA, CGPA, or coursesCovered.");
        }
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;
        this.major = major;
        this.subjects = subjects;
        this.onProbation = onProbation;
    }

    public void finalsCompleted(double[] grades) {
        if (grades == null || grades.length == 0) {
            System.out.println("Grades array is empty or null.");
            return;
        }
        
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double newGpa = sum / grades.length;

        this.gpa = newGpa;
        this.cgpa = (this.cgpa * this.coursesCovered + newGpa * grades.length) / (grades.length + this.coursesCovered);
        this.coursesCovered += grades.length;
        this.onProbation = this.cgpa < 2.5 && this.gpa < 2.5;
    }
}