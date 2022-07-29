package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends func = new CalculatorWithMathExtends();
        double result = func.addition((func.addition(4.1, func.multiplication(15, 7))),
                (func.exponentiation(func.division(28, 5), 2)));
        System.out.println(result);
    }
}
