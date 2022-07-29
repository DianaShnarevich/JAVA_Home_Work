package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends fun = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(fun);

        double result = fun.addition((fun.addition(4.1, fun.multiplication(15, 7))),
                (fun.exponentiation(fun.division(28, 5), 2)));


        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
