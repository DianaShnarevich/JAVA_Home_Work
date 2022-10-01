package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(calc1);

        double result_1 = calculator1.addition((calculator1.addition(4.1, calculator1.multiplication(15, 7))),
                (calculator1.exponentiation(calculator1.division(28, 5), 2)));

        System.out.println(result_1);
        System.out.println(calculator1.getCountOperation());

        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calc2);

        double result_2 = calculator2.addition((calculator2.addition(4.1, calculator2.multiplication(15, 7))),
                (calculator2.exponentiation(calculator2.division(28, 5), 2)));

        System.out.println(result_2);
        System.out.println(calculator2.getCountOperation());

        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calc3);


        double result_3 = calculator3.addition((calculator3.addition(4.1, calculator3.multiplication(15, 7))),
                (calculator3.exponentiation(calculator3.division(28, 5), 2)));

        System.out.println(result_3);
        System.out.println(calculator3.getCountOperation());
    }
}
