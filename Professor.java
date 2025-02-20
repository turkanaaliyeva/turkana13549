import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Faculty {
    private List<String> coursesTaught;
    private List<String> researchPapers;
    private List<Student> assignedStudents;
    private String phd;  // added phd 
    private String researchInterest; //rscrh interest

   

    public Professor(int facultyID, String firstName, String secondName, String email, String phoneNumber,
            String department, String position, String officeLocation, String hireDate, boolean availability,
            List<String> coursesTaught, List<String> researchPapers, List<Student> assignedStudents, String phd,
            String researchInterest) {
        super(facultyID, firstName, secondName, email, phoneNumber, department, position, officeLocation, hireDate,
                availability);
        this.coursesTaught = coursesTaught;
        this.researchPapers = researchPapers;
        this.assignedStudents = assignedStudents;
        this.phd = phd;
        this.researchInterest = researchInterest;
    }

    //method to teach a course
    public void teachCourse(String course) {
        if (course != null && !course.isEmpty()) {
            coursesTaught.add(course);
            System.out.println(getFirstName() + " is now teaching: " + course);
        } else {
            System.out.println("Error: Course name cannot be empty.");
        }
    }

    //to publish a research paper
    public void publishResearch(String paperTitle) {
        if (paperTitle != null && !paperTitle.isEmpty()) {
            researchPapers.add(paperTitle);
            System.out.println(getFirstName() + " published a new research paper: " + paperTitle);
        } else {
            System.out.println("Error: Research paper title cannot be empty.");
        }
    }

    // Method to assign a TA to a course
    public void assignTA(TeachingAssistant ta, String course) {
        if (ta != null && course != null && !course.isEmpty()) {
            System.out.println("Professor " + getFirstName() + " assigned " + ta.getFullName() + " as a TA for " + course);
            ta.assignToCourse(course);
        } else {
            System.out.println("Error: TA or course is invalid.");
        }
    }

    public void defendDissertation() {
        if ("PhD".equals(phd)) {  
            System.out.println(getFirstName() + " is defending their dissertation in " + researchInterest + ".");
        } else {
            System.out.println(getFirstName() + " has not completed a dissertation defense.");
        }
    }

}
