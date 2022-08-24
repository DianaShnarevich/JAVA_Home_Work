package home_work_4.home_work_3.runners;

import home_work_4.home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper fun = new CalculatorWithCounterAutoSuper();

        double result = fun.addition((fun.addition(4.1, fun.multiplication(15, 7))),
                (fun.exponentiation(fun.division(28, 5), 2)));

        System.out.println(result);

        System.out.println(fun.getCountOperation());
    }
}
