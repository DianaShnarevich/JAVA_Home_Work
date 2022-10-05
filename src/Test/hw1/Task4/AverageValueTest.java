package Test.hw1.Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageValueTest {
    @Test
    public void getAverage(){
        home_work_1.branching_operators.AverageValue averageNumber = new home_work_1.branching_operators.AverageValue(13, 22, 44);
        Assertions.assertEquals(13, averageNumber.getAverage());
    }
}
