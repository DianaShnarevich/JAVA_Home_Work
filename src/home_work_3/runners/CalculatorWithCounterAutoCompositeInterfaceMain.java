package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(calc);

        double result = calculator.addition((calculator.addition(4.1, calculator.multiplication(15, 7))),
                (calculator.exponentiation(calculator.division(28, 5), 2)));


        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
