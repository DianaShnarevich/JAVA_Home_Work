package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy func = new CalculatorWithMathCopy();

        double result = func.addition((func.addition(4.1, func.multiplication(15, 7))),
                (func.exponentiation(func.division(28, 5), 2)));

        System.out.println(result);
    }
}
