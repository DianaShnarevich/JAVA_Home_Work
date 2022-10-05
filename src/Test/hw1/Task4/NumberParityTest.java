package Test.hw1.Task4;

import home_work_1.branching_operators.NumberParity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberParityTest {
    @Test
    public void numberParity() {
        NumberParity num1 = new NumberParity(12);
        Assertions.assertEquals("Чётное: ", num1.numberParity());

        NumberParity num2 = new NumberParity(13);
        Assertions.assertEquals("Нечётное: ", num2.numberParity());
    }
}
