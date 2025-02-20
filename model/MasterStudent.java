package model;

import java.util.ArrayList;
import service.AcademicDetails;
import service.Course;

public class MasterStudent extends Student {
    private String thesisTitle;
    private String researchField;
    private boolean hasPublishedPaper;

    public MasterStudent(String fullName, String email, int id, int age, double cgpa, String major,
                         ArrayList<Course> courses, boolean onProbation, int semester, 
                         AcademicDetails academicDetails, String thesisTitle, String researchField, boolean hasPublishedPaper) {
super(fullName, id, age, semester, email);
        this.thesisTitle = thesisTitle;
        this.researchField = researchField;
        this.hasPublishedPaper = hasPublishedPaper;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public boolean hasPublishedPaper() {
        return hasPublishedPaper;
    }

    public void setHasPublishedPaper(boolean hasPublishedPaper) {
        this.hasPublishedPaper = hasPublishedPaper;
    }

    public void publishResearch(String paperTitle) {
        if (paperTitle != null && !paperTitle.isEmpty()) {
            this.hasPublishedPaper = true;
            System.out.println(getFullName() + " has published a research paper titled: " + paperTitle);
        } else {
            System.out.println("Error: Research paper title cannot be empty.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMasterStudent [ThesisTitle=" + thesisTitle + 
               ", ResearchField=" + researchField + 
               ", PublishedPaper=" + hasPublishedPaper + "]";
    }
}

