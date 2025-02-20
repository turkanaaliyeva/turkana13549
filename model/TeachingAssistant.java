package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import service.AcademicDetails;
import service.Course;

public class TeachingAssistant extends Student {
    private String[] assignedCourses;
    private int courseCount;
    private static final int MAX_COURSES = 10;
    private Professor supervisor;

    public TeachingAssistant(String fullName, int id, int age, float gpa, String email, String[] assignedCourses,
            int courseCount, Professor supervisor) {
        super(fullName, id, age, gpa, email);
        this.assignedCourses = assignedCourses;
        this.courseCount = courseCount;
        this.supervisor = supervisor;
    }


    public TeachingAssistant(String fullName, String address, String phone, String email, int id, int age,
            Date dateOfBirth2, double cgpa, String major, ArrayList<Course> courses, boolean onProbation, double[] gpas,
            int semester, double[] semesterGPAs, String[] completedCourses, String[] instructors, int coursesCovered,
            AcademicDetails academicDetails, String[] assignedCourses, int courseCount, Professor supervisor) {
        super(fullName, address, phone, email, id, age, dateOfBirth2, cgpa, major, courses, onProbation, gpas, semester,
                semesterGPAs, completedCourses, instructors, coursesCovered, academicDetails);
        this.assignedCourses = assignedCourses;
        this.courseCount = courseCount;
        this.supervisor = supervisor;
    }


    public void assignToCourse(String course) {
        if (courseCount < MAX_COURSES) {
            for (int i = 0; i < courseCount; i++) {
                if (assignedCourses[i].equals(course)) {
                    System.out.println(this.getFullName() + " is already assigned to " + course);
                    return;
                }
            }
            assignedCourses[courseCount++] = course;
            System.out.println(this.getFullName() + " has been assigned to assist with the course: " + course);
        } else {
            System.out.println("Cannot assign more courses. Maximum limit reached.");
        }
    }

    public void removeFromCourse(String course) {
        for (int i = 0; i < courseCount; i++) {
            if (assignedCourses[i].equals(course)) {
                assignedCourses[i] = assignedCourses[courseCount - 1]; // Replace with last element
                assignedCourses[courseCount - 1] = null; // Nullify last element
                courseCount--;
                System.out.println(this.getFullName() + " has been removed from assisting with the course: " + course);
                return;
            }
        }
        System.out.println(this.getFullName() + " was not assigned to " + course);
    }

    public String[] getAssignedCoursesArray() {
        return Arrays.copyOf(assignedCourses, courseCount);
    }

    public void holdOfficeHours() {
        System.out.println(this.getFullName() + " is holding office hours.");
    }

    public void conductLab(String labName) {
        System.out.println(this.getFullName() + " is conducting the lab session: " + labName);
    }

    public void gradeStudent(Student student, double grade) {
        System.out.println(this.getFullName() + " (TA) graded student " + student.getFullName() + " with " + grade);
    }



    @Override
    public String toString() {
        return "TeachingAssistant [assignedCourses=" + Arrays.toString(assignedCourses) + ", courseCount=" + courseCount
                + ", supervisor=" + supervisor + "]";
    }






    

   
    
}
