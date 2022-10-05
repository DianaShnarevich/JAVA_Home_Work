package Test.hw2.Loops;
import home_work_2.loops.Task_1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_3Test {
    @Test
    public void exponentiation() {
        Task_1_3 test1 = new Task_1_3(9,1);
        Assertions.assertEquals(9,test1.degreefunc());

        Task_1_3 test2 = new Task_1_3(6,3);
        Assertions.assertEquals(216,test2.degreefunc());

        Task_1_3 test3 = new Task_1_3(9.5,3);
        Assertions.assertEquals(857.375,test3.degreefunc());

        Task_1_3 test4 = new Task_1_3(1,5);
        Assertions.assertEquals(1,test4.degreefunc());
    }
}

