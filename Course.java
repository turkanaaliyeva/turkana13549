public class Course {
    // fields
    private String name;
    private int creditHours;
    private int CRN;
    private People instructor;

    // constructor
    public Course(String name, int creditHours, int CRN, People instructor){
        this.name = name;
        this.creditHours = creditHours;
        this.CRN = CRN;
        this.instructor = instructor;
    }

    // getter methods
    public String getName() {
        return name;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public int getCRN() {
        return CRN;
    }
    public People getInstructor() {
        return instructor;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public void setCRN(int cRN) {
        CRN = cRN;
    }
    public void setInstructor(People instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCredit Hours: " + creditHours + "\nCRN: " + CRN + "\nInstructor: " + instructor.getFullName();
    }

    
}
