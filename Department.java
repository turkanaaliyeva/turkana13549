public class Department {
    String title;
    String dean;
    int studentCount;
    Program[] programs;    


    public Department(String title, String dean, int studentCount, Program[] programs) {
        this.title = title;
        this.dean = dean;
        this.studentCount = studentCount;
        this.programs = programs;
    }




    public Department(String title, String dean) {
        this.title = title;
        this.dean = dean;
    }

    

}
