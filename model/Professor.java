package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Faculty {
    private List<String> coursesTaught;
    private List<String> researchPapers;
    private List<Student> assignedStudents;
    private String phd;  // added phd 
    private String researchInterest; //rscrh interest

   
  public Professor(String fullName, String address, String phone, String email, int ID, int age, Date dateOfBirth,
                     int facultyID, String department, String position, String officeLocation, Date hireDate,
                     boolean availability, String phd, String researchInterest) {
        super(fullName, address, phone, email, ID, age, dateOfBirth, facultyID, department, position, officeLocation, hireDate, availability);
        this.coursesTaught = new ArrayList<>();
        this.researchPapers = new ArrayList<>();
        this.assignedStudents = new ArrayList<>();
        this.phd = phd;
        this.researchInterest = researchInterest;
    }

    //method to teach a course
    public void teachCourse(String course) {
        if (course != null && !course.isEmpty()) {
            coursesTaught.add(course);
            System.out.println(getFullName() + " is now teaching: " + course);
        } else {
            System.out.println("Error: Course name cannot be empty.");
        }
    }

    //to publish a research paper
    public void publishResearch(String paperTitle) {
        if (paperTitle != null && !paperTitle.isEmpty()) {
            researchPapers.add(paperTitle);
            System.out.println(getFullName() + " published a new research paper: " + paperTitle);
        } else {
            System.out.println("Error: Research paper title cannot be empty.");
        }
    }

    // Method to assign a TA to a course
    public void assignTA(TeachingAssistant ta, String course) {
        if (ta != null && course != null && !course.isEmpty()) {
            System.out.println("Professor " + getFullName() + " assigned " + ta.getFullName() + " as a TA for " + course);
            ta.assignToCourse(course);
        } else {
            System.out.println("Error: TA or course is invalid.");
        }
    }

    public void defendDissertation() {
        if ("PhD".equals(phd)) {  
            System.out.println(getFullName() + " is defending their dissertation in " + researchInterest + ".");
        } else {
            System.out.println(getFullName() + " has not completed a dissertation defense.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nProfessor Details:\n" +
               "PhD: " + phd + 
               "\nResearch Interest: " + researchInterest + 
               "\nCourses Taught: " + coursesTaught + 
               "\nResearch Papers: " + researchPapers +
               "\nAssigned Students: " + assignedStudents;
    }
    

}
