package courseJava.chapters.chapter3.chapter3_14;

public class DateClass {

    private int day;
    private int month;
    private int year;


    public DateClass(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String DisplayDate(int day, int month, int year){

        String date = year + "/" + month + "/" + day;
        return date;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
