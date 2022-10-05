package Test.hw1.Task4;

import home_work_1.branching_operators.Divisibility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibilityTest {
    @Test
    public void getAnswer() {
        Divisibility div1 = new Divisibility(15, 1);
        Assertions.assertEquals("The number 2 is divided by the number 1",div1.getAnswer());

        Divisibility div2 = new Divisibility(6, 1);
        Assertions.assertEquals("The number 1 is divided by the number 2",div2.getAnswer());

        Divisibility div3 = new Divisibility(0, 6);
        Assertions.assertEquals("You can't divide by zero!",div3.getAnswer());


        Divisibility div4 = new Divisibility(3, 14);
        Assertions.assertEquals("The entered numbers are not divisible by each other",div4.getAnswer());
    }
}
