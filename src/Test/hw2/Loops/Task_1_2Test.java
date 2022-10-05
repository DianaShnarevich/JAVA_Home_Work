package Test.hw2.Loops;

import home_work_2.loops.Task_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_2Test {

    @Test
    public void getCheck() {
        Task_1_2 test1 = new Task_1_2(456789);
        Assertions.assertEquals(60480,test1.func());

        Task_1_2 test2 = new Task_1_2(123450);
        Assertions.assertEquals(120,test2.func());

        Task_1_2 test3 = new Task_1_2(0);
        Assertions.assertEquals(0,test3.func());
    }
}
