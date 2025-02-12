public class Student extends Object {
    private String name;
    private int id; 
    private int coursesCovered;
    private double cgpa; 
    private String major;
    private List<String> subjects; 
    private boolean onProbation; 
    private double[] gpas = new double[12];
    private int semester = 1;



    Student(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects, boolean onProbation, int semester) {
        if (id < 0|| cgpa < 0 || coursesCovered < 0) {
            System.out.println("Negative values are not allowed for ID, GPA, CGPA, or coursesCovered.");
        }
        this.name = name;
        this.id = id;
        this.coursesCovered = coursesCovered;
        this.cgpa = cgpa;
        this.major = major;
        this.subjects = subjects;
        this.onProbation = onProbation;
        this.semester = semester;
    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void GetStudentInfo(){
        System.out.println("Name: " + this.name +
        "\nId: " + this.id +
        "\nGPA: " + this.gpa +
        "\nAge: " + this.age +
        "\nEmail: " + this.email);
        System.out.println("Courses: ");
        
        for (Course course : this.courses) {
            System.out.println("\n_________________\n");
            course.GetCourse();
            
        }
}
    
    public boolean AddCourse(Course course){
        boolean checker = this.courses.add(course);
        if(checker){
            System.out.println("Course added succcesfully!!");
            return checker;
        }
        System.err.println("Error occured((");
        return checker;

    }
    public boolean withdrawFromCourse(int id){
        boolean checker = this.courses.removeIf((course)-> course.getId() == id);
        if(checker){
            System.out.println("Course deleted succcesfully!!");
            return checker;
        }
        System.err.println("Error occured((");
        return checker;
    }
    public float CalculateGPA(){
        int size = this.courses.size();
        float overallGpa = 0;
        for (Course course : this.courses) {
            overallGpa += course.findValue();
        }
        overallGpa = overallGpa / (float) size;
        return overallGpa;

    public void updateSemester(double[] grades) {
        if (grades == null || grades.length == 0) {
            System.out.println("Grades array is empty or null.");
            return;
        }
        
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double newGpa = sum / grades.length;

        this.gpas[this.semester] = newGpa;
        this.cgpa = (this.cgpa * this.coursesCovered + newGpa * grades.length) / (grades.length + this.coursesCovered);
        this.coursesCovered += grades.length;
        this.onProbation = this.cgpa < 2.5 && this.gpas[this.semester] < 2.5;
    }



    public String toString() {
        return "Name: " + this.name + " CGPA: " + this.cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getCoursesCovered() {
        return coursesCovered;
    }

    public void setCoursesCovered(int coursesCovered) {
        this.coursesCovered = coursesCovered;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public boolean isOnProbation() {
        return onProbation;
    }

    public void setOnProbation(boolean onProbation) {
        this.onProbation = onProbation;
    }

    public double[] getGpas() {
        return gpas;
    }

    public void setGpas(double[] gpas) {
        this.gpas = gpas;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
