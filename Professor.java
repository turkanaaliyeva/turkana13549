import java.util.List;

public class Professor extends Staff {
    private List<String> coursesTaught;
    private List<String> researchPapers;
    private List<Student> assignedStudents;

    public Professor(String name, String department, double salary, String email, String phoneNumber, String officeNumber, List<String> coursesTaught) {
        super(name, department, salary, "Active", "Professor", email, phoneNumber, officeNumber);
        this.coursesTaught = coursesTaught;
    }

    public void teachCourse(String course) {
        coursesTaught.add(course);
        System.out.println(this.getName() + " is now teaching: " + course);
    }

    public void publishResearch(String paperTitle) {
        researchPapers.add(paperTitle);
        System.out.println(this.getName() + " published a new research paper: " + paperTitle);
    }

    public void assignTA(TeachingAssistant ta, String course) {
        System.out.println("Professor " + this.getName() + " assigned " + ta.getName() + " as a TA for " + course);
        ta.assignToCourse(course);
    }

    public void gradeStudent(Student student, double grade) {
        System.out.println("Professor " + this.getName() + " graded student " + student.getName() + " with " + grade);
    }
}
