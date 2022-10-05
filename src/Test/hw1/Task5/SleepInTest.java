package Test.hw1.Task5;
import home_work_1.SleepIn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SleepInTest {
    @Test
    public void sleepInFalse() {
        Assertions.assertEquals(false, SleepIn.sleepIn(true, false));

    }

    @Test
    public void sleepInTrue() {
        Assertions.assertEquals(true, SleepIn.sleepIn(false, true));
    }
}
