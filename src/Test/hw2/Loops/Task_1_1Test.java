package Test.hw2.Loops;
import home_work_2.loops.Task_1_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_1Test {

    @Test
    public void array() {
        Task_1_1_1 test1 = new Task_1_1_1(6);
        Assertions.assertEquals(720, test1.array());

        Task_1_1_1 test2 = new Task_1_1_1(0);
        Assertions.assertEquals(0, test2.array());

        Task_1_1_1 test3 = new Task_1_1_1(-4);
        Assertions.assertEquals(-4, test3.array());
    }
}
