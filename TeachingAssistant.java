import java.util.ArrayList;
import java.util.List;

public class TeachingAssistant extends Staff {
    private List<String> assignedCourses;
    private Professor supervisor;

    public Professor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }

    public TeachingAssistant(String name, String department, double salary, String email, String phoneNumber, String officeNumber, Professor supervisor) {
        super(name, department, salary, "Active", "Teaching Assistant", email, phoneNumber, officeNumber);
        this.supervisor = supervisor;
        this.assignedCourses=new ArrayList<>();
    }

    public void assignToCourse(String course) {
        assignedCourses.add(course);
        System.out.println(this.getName() + " has been assigned to assist with the course: " + course);
    }

    public void holdOfficeHours() {
        System.out.println(this.getName() + " is holding office hours.");
    }

    public void conductLab(String labName) {
        System.out.println(this.getName() + " is conducting the lab session: " + labName);
    }

    public void gradeStudent(Student student, double grade) {
        System.out.println(this.getName() + " (TA) graded student " + student.getFullName() + " with " + grade);
    }
}
