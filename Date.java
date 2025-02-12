public class Date {
    // fields
    private int day;
    private int month;
    private int year;

    // constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // getter methods
    public String getDate(){
        String res = "";
        if(day < 10) res += "0";
        res = res + day + "/";
        if(month < 10) res += "0";
        res = res + month + "/" + year;
        return res;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    
    // setter methods
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return getDate();
    }
}

