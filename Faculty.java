import java.util.ArrayList;

public class Faculty
{
    private int id;

    private String Facultyname; //SITE
    private String location; // B building
    private String Dean; 
    private ArrayList<String> departments; //Cs CE

    private ArrayList<String> ProgramsOffered; // CE, CS, EEE

    public Faculty(int id, String facultyname, String location, String dean, ArrayList<String> departments,
            ArrayList<String> programsOffered) {
        this.id = id;
        Facultyname = facultyname;
        this.location = location;
        Dean = dean;
        this.departments = departments;
        ProgramsOffered = programsOffered;
    }
    public Faculty() {
    }

    public int numberofStuds()
    {
        return 5;
    }
    public int numberOfStaff()
    {
        return 10;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Faculty [id=" + id + ", Facultyname=" + Facultyname + ", location=" + location + ", Dean=" + Dean
                + ", departments=" + departments + ", ProgramsOffered=" + ProgramsOffered + ", toString()="
                + super.toString() + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFacultyname() {
        return Facultyname;
    }
    public void setFacultyname(String facultyname) {
        Facultyname = facultyname;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDean() {
        return Dean;
    }
    public void setDean(String dean) {
        Dean = dean;
    }
    public ArrayList<String> getDepartments() {
        return departments;
    }
    public void setDepartments(ArrayList<String> departments) {
        this.departments = departments;
    }
    public ArrayList<String> getProgramsOffered() {
        return ProgramsOffered;
    }
    public void setProgramsOffered(ArrayList<String> programsOffered) {
        ProgramsOffered = programsOffered;
    }






}