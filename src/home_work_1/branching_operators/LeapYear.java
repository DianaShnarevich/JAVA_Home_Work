package home_work_1.branching_operators;


public class LeapYear {
    private long year;

    public LeapYear(long year){
        this.year = year;
    }

    public String getLeepYear() {
        if (year % 4 == 0 & year % 100 != 0) {
            return "This year is leap";
        } else {
            return "This year is not a leap";
        }
    }
}
