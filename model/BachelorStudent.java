package model;

import java.util.ArrayList;
import service.AcademicDetails;
import service.Course;

public class BachelorStudent extends Student {
    private String thesisTitle;
    private boolean internshipCompleted;

    public BachelorStudent(String fullName, String email, int id, int age, double cgpa, String major,
                           ArrayList<Course> courses, boolean onProbation, int semester, 
                           AcademicDetails academicDetails, String thesisTitle, boolean internshipCompleted) {
      super(fullName, id, age, semester, email);
         this.thesisTitle = thesisTitle;
        this.internshipCompleted = internshipCompleted;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public boolean isInternshipCompleted() {
        return internshipCompleted;
    }

    public void setInternshipCompleted(boolean internshipCompleted) {
        this.internshipCompleted = internshipCompleted;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nBachelorStudent [ThesisTitle=" + thesisTitle + 
               ", InternshipCompleted=" + internshipCompleted + "]";
    }
}
