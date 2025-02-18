import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Staff {
    private List<String> coursesTaught;
    private List<String> researchPapers;
    private List<Student> assignedStudents;


    public Professor(String fullName, String gender, String phone, String email, int age, int ID, Date dateOfBirth,
            double salary, String status, String role, String officeNumber, String department,
            ArrayList<Room> assignedRooms, List<String> coursesTaught, List<String> researchPapers,
            List<Student> assignedStudents) {
        super(fullName, gender, phone, email, age, ID, dateOfBirth, salary, status, role, officeNumber, department,
                assignedRooms);
        this.coursesTaught = coursesTaught;
        this.researchPapers = researchPapers;
        this.assignedStudents = assignedStudents;
    }

    public Professor(String fullName, int id, int age, String email, String status, String role, String department,
            List<String> coursesTaught, List<String> researchPapers, List<Student> assignedStudents) {
        super(fullName, id, age, email, status, role, department);
        this.coursesTaught = coursesTaught;
        this.researchPapers = researchPapers;
        this.assignedStudents = assignedStudents;
    }

    public void teachCourse(String course) {
        if (course != null && !course.isEmpty()) {
            coursesTaught.add(course);
            System.out.println(getFullName() + " is now teaching: " + course);
        } else {
            System.out.println("Error: Course name cannot be empty.");
        }
    }

    public void publishResearch(String paperTitle) {
        if (paperTitle != null && !paperTitle.isEmpty()) {
            researchPapers.add(paperTitle);
            System.out.println(getFullName() + " published a new research paper: " + paperTitle);
        } else {
            System.out.println("Error: Research paper title cannot be empty.");
        }
    }

    public void assignTA(TeachingAssistant ta, String course) {
        if (ta != null && course != null && !course.isEmpty()) {
            System.out.println("Professor " + getFullName() + " assigned " + ta.getFullName() + " as a TA for " + course);
            ta.assignToCourse(course);
        } else {
            System.out.println("Error: TA or course is invalid.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCourses Taught: " + coursesTaught;
    }
}
