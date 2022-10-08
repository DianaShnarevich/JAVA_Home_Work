package Test.hw2.Loops;
import home_work_2.loops.Task_1_5;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Task_1_5Test {

    @Test
    public void maxOne() {
        Task_1_5 test1 = new Task_1_5();
        Assertions.assertEquals(9, test1.task_1_5_1(9375639));
    }

    @Test
    public void evenOdd() {
        Task_1_5 test2 = new Task_1_5();
        Assertions.assertEquals("3; 3", test2.task_1_5_3(367281));
    }

    @Test
    public void feb() {
        int[] arr1 = {1, 2, 3, 5, 8, 13};
        int[] arr2 = Task_1_5.task_1_5_4(6);
        assertArrayEquals(arr1, arr2);
    }

    @Test
    public void step() {
        int[] arr1 = {3, 6, 9, 12, 15, 18, 21};
        int[] arr2 = Task_1_5.task_1_5_5(3, 21, 3);
        assertArrayEquals(arr1, arr2);
    }

    @Test
    public void revers() {
        Task_1_5 test5 = new Task_1_5();
        Assertions.assertEquals(987654321,test5.task_1_5_6(123456789));
    }
}
