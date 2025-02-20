package service;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String description;
    private int courseCode;
    private int credits;
    private int numberOfStudents;
    private char passingGrade;
    private List<String> studentNames;
    private List<String> topics;
    private List<Integer> prerequisiteCourses;

    public Course(String name, String description, int courseCode, int credits, int numberOfStudents,
                  char passingGrade, List<String> studentNames, List<String> topics, List<Integer> prerequisiteCourses) {
        this.name = name;
        this.description = description;
        this.courseCode = courseCode;
        this.credits = credits;
        this.numberOfStudents = numberOfStudents;
        this.passingGrade = passingGrade;
        this.studentNames = studentNames != null ? new ArrayList<>(studentNames) : new ArrayList<>();
        this.topics = topics != null ? new ArrayList<>(topics) : new ArrayList<>();
        this.prerequisiteCourses = prerequisiteCourses != null ? new ArrayList<>(prerequisiteCourses) : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", courseCode=" + courseCode +
                ", credits=" + credits +
                ", numberOfStudents=" + numberOfStudents +
                ", passingGrade=" + passingGrade +
                ", studentNames=" + studentNames +
                ", topics=" + topics +
                ", prerequisiteCourses=" + prerequisiteCourses +
                '}';
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getCourseCode() { return courseCode; }
    public void setCourseCode(int courseCode) { this.courseCode = courseCode; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public int getNumberOfStudents() { return numberOfStudents; }
    public void setNumberOfStudents(int numberOfStudents) { this.numberOfStudents = numberOfStudents; }

    public char getPassingGrade() { return passingGrade; }
    public void setPassingGrade(char passingGrade) { this.passingGrade = passingGrade; }

    public List<String> getStudentNames() { return new ArrayList<>(studentNames); }
    public void setStudentNames(List<String> studentNames) { this.studentNames = new ArrayList<>(studentNames); }

    public List<String> getTopics() { return new ArrayList<>(topics); }
    public void setTopics(List<String> topics) { this.topics = new ArrayList<>(topics); }

    public List<Integer> getPrerequisiteCourses() { return new ArrayList<>(prerequisiteCourses); }
    public void setPrerequisiteCourses(List<Integer> prerequisiteCourses) { this.prerequisiteCourses = new ArrayList<>(prerequisiteCourses); }
}
