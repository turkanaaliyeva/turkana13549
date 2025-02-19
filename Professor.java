import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Faculty {
    private List<String> coursesTaught;
    private List<String> researchPapers;
    private List<Student> assignedStudents;


    public Professor(String firstName, String secondName, String email, String phoneNumber, int facultyID, 
                     String department, String position, String officeLocation, String hireDate, boolean availability) {
        super(facultyID, firstName, secondName, email, phoneNumber, department, position, officeLocation, hireDate, availability);
    }

    public Professor(int facultyID, String firstName, String secondName) {
        super(facultyID, firstName, secondName);

    }

    public void teachCourse(String course) {
        if (course != null && !course.isEmpty()) {
            coursesTaught.add(course);
            System.out.println(getFirstName() + " " + getSecondName() + " is now teaching: " + course);
        } else {
            System.out.println("Error: Course name cannot be empty.");
        }
    }

    public void publishResearch(String paperTitle) {
        if (paperTitle != null && !paperTitle.isEmpty()) {
            researchPapers.add(paperTitle);
            System.out.println(getFirstName() + " " + getSecondName() + " published a new research paper: " + paperTitle);
        } else {
            System.out.println("Error: Research paper title cannot be empty.");
        }
    }

    public void assignTA(TeachingAssistant ta, String course) {
        if (ta != null && course != null && !course.isEmpty()) {
            System.out.println("Professor " + getFirstName() + " " + getSecondName() + " assigned " + ta.getFullName() + " as a TA for " + course);
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
