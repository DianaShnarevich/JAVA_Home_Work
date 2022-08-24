package home_work_4.home_work_3.calcs.additional;

import home_work_4.home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_4.home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_4.home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
    }

    private long count = 0;

    private void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public double addition(double num1, double num2) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.addition(num1, num2);
        } else if (calculator2 != null) {
            return calculator2.addition(num1, num2);
        } else {
            return calculator3.addition(num1, num1);
        }
    }

    public double subtraction(double num1, double num2) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.subtraction(num1, num2);
        } else if (calculator2 != null) {
            return calculator2.subtraction(num1, num2);
        } else {
            return calculator3.subtraction(num1, num2);
        }
    }

    public double multiplication(double num1, double num2) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.multiplication(num1, num2);
        } else if (calculator2 != null) {
            return calculator2.multiplication(num1, num2);
        } else {
            return calculator3.multiplication(num1, num2);
        }
    }

    public double division(double num1, double num2) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.division(num1, num2);
        } else if (calculator2 != null) {
            return calculator2.division(num1, num2);
        } else {
            return calculator3.division(num1, num2);
        }
    }

    public double exponentiation(double num1, int degree) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.exponentiation(num1, degree);
        } else if (calculator2 != null) {
            return calculator2.exponentiation(num1, degree);
        } else {
            return calculator3.exponentiation(num1, degree);
        }
    }

    public double module(double number) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.module(number);
        } else if (calculator2 != null) {
            return calculator2.module(number);
        } else {
            return calculator3.module(number);
        }
    }

    public double square_root(double number) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.square_root(number);
        } else if (calculator2 != null) {
            return calculator2.square_root(number);
        } else {
            return calculator3.square_root(number);
        }
    }

}
