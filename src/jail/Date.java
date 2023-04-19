package jail;

import java.time.*;

public class Date {

    private LocalDate date;

    public Date() {
        date = LocalDate.now();
    }

    public Date(LocalDate ld){
        date = ld;
    }
    
    public Date(int day, int month, int year) {
        date = LocalDate.of(year, month, day);
    }

    public Date(Date d) {
        this.date = LocalDate.of(d.date.getYear(), d.date.getMonthValue(), d.date.getDayOfMonth());
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public int getYear() {
        return date.getYear();
    }

    public Date releaseDate(long duration) {
        Date d = new Date(date.plusYears(duration));
        return d;
    }

    public int getAge() {
        LocalDate curDate = LocalDate.now();
        return Period.between(date, curDate).getYears();
    }
    // take the date of entry and get the period petween 
    public String remainingTime() {
        LocalDate curDate = LocalDate.now();
        Period rD = Period.between(curDate, date);
        return String.format("%d years, %d months, %d days", rD.getYears(), rD.getMonths(), rD.getDays());
    }
    
    
    
    @Override
    public String toString() {
        return String.format("%d-%d-%d", getDay(), getMonth(), getYear());
    }
}
