package Test.hw1.Task4;
import home_work_1.branching_operators.LeapYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
    public void getSolution() {
        LeapYear leapYear = new LeapYear(2024);
        Assertions.assertEquals("This year is leap",leapYear.getLeepYear());

        LeapYear leapYear1 = new LeapYear(1999);
        Assertions.assertEquals("This year is not a leap",leapYear1.getLeepYear());
    }
}
