package model;

import java.util.Date;

public class Instuctor extends Faculty{
   
    private String expertiseArea;
    private int yearsOfExperience;
    private boolean isTenured;
    public Instuctor(String fullName, String address, String phone, String email, int ID, int age, Date dateOfBirth,
            int facultyID, String department, String position, String officeLocation, Date hireDate,
            boolean availability, String expertiseArea, int yearsOfExperience, boolean isTenured) {
        super(fullName, address, phone, email, ID, age, dateOfBirth, facultyID, department, position, officeLocation,
                hireDate, availability);
        this.expertiseArea = expertiseArea;
        this.yearsOfExperience = yearsOfExperience;
        this.isTenured = isTenured;
    }
    public String getExpertiseArea() {
        return expertiseArea;
    }
    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public boolean isTenured() {
        return isTenured;
    }
    public void setTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nInstructor Details:" +
               "\nExpertise Area: " + expertiseArea +
               "\nYears of Experience: " + yearsOfExperience +
               "\nTenured: " + (isTenured ? "Yes" : "No");
    }


}
