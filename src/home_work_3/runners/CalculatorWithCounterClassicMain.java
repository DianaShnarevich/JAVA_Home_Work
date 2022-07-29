package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic fun = new CalculatorWithCounterClassic();

        double result = fun.addition((fun.addition(4.1, fun.multiplication(15, 7))),
                (fun.exponentiation(fun.division(28, 5), 2)));

        fun.incrementCountOperation();

        System.out.println(result);

        System.out.println(fun.getCountOperation());
    }
}
