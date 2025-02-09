public class Student {
    private String name;
    private int id;
    private double gpa;
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setGpa (double gpa) {
if (gpa >= 0 && gpa <= 4){ this.gpa=gpa;} 
    else { System.out.println("Incorrect GPA");}
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Studen ID:" + id)
        Sytem.out.println ("Student GPA;" + gpa)