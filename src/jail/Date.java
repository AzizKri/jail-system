package jail;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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
    
    public Date releaseDate(int duration){
        int y = this.year + duration / 365;
        duration %= 365;
        int m = this.month + duration / 30;
        duration %= 30;
        int d = this.day + duration;
        return new Date(d, m, y);
    }
    
    public int toDays(){
        return this.year * 365 + this.month * 30 + this.day;
    }
    
    public String toString(){
        return String.format("%02d/%02d/%02d", day, month, year);
    }
}
