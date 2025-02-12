public class Course {
        public String courseName;
        public int id;
        public int creditScore;
        public float grade;
    
        public Course(String courseName, int creditScore, float grade){
            this.courseName = courseName;
            this.creditScore = creditScore;
            this.grade = grade;
    
        }
        public void GetCourse(){
            System.out.println("Course Name: " + courseName);
            System.out.println("Credit Score: " + creditScore);
            System.out.println("Grade: " + grade);
            
        }
        public float findValue(){
            
            float value = (this.grade*this.creditScore)/100;
            return value;
        }
        public int getId(){
            return this.id;
        }
        public String getCourseName() {
            return this.courseName;
        }
    
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
    
        public int getCreditScore() {
            return this.creditScore;
        }
    
        public void setCreditScore(int creditScore) {
            this.creditScore = creditScore;
        }
    
        public float getGrade(){
            return this.grade;
        }
    
        public void setGrade(float grade) {
            this.grade = grade;
        }
    
    }