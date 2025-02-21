package model;
import java.util.List;

public class PhDStudent extends Student {

    private String dissertationTitle;
    private String researchArea;
    private boolean isTeachingAssistant;
    private boolean thesisSubmitted;

    public PhDStudent(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects,
                       boolean onProbation, int semester, String dissertationTitle, String researchArea, boolean isTeachingAssistant,boolean thesisSubmitted) {
super(name, id, coursesCovered, semester, researchArea);
        this.dissertationTitle = dissertationTitle;
        this.researchArea = researchArea;
        this.isTeachingAssistant = isTeachingAssistant;
        this.thesisSubmitted = thesisSubmitted;
        
    }


   
    public String getDissertationTitle() {
        return dissertationTitle;
    }

    public void setDissertationTitle(String dissertationTitle) {
        this.dissertationTitle = dissertationTitle;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    
    public boolean isTeachingAssistant() {
        return isTeachingAssistant;
    }

    public void setTeachingAssistant(boolean teachingAssistant) {
        isTeachingAssistant = teachingAssistant;
    }


    public boolean isThesisSubmitted() {
        return thesisSubmitted;
    }

    public void setThesisSubmitted(boolean thesisSubmitted) {
        this.thesisSubmitted = thesisSubmitted;
    }

    
}
