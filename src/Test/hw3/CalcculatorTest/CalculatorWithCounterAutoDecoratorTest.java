package Test.hw3.CalcculatorTest;
import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorWithCounterAutoDecoratorTest {

    private final CalculatorWithCounterAutoDecorator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

    @Test
    public void adding() {
        Assertions.assertEquals(9, calculator.addition(7, 3));
    }

    @Test
    public void subtraction() {
        Assertions.assertEquals(6, calculator.subtraction(8, 2));
    }

    @Test
    public void multiplication() {
        Assertions.assertEquals(4, calculator.multiplication(2, 2));
    }

    @Test
    public void division() {
        Assertions.assertEquals(5, calculator.division(10, 2));
    }

    @Test
    public void exponentiation() {
        Assertions.assertEquals(25, calculator.exponentiation(5, 2));
    }

    @Test
    public void numberModulus() {
        Assertions.assertEquals(12, calculator.module(-12));
    }

    @Test
    public void squareRoot() {
        Assertions.assertEquals(4, calculator.square_root(16));
    }
}
