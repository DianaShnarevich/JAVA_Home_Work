package home_work_4.home_work_3.calcs.simple;

import home_work_4.home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double exponentiation(double num1, int degree){
        return Math.pow(num1, degree);
    }

    public double module(double number) {
        return Math.abs(number);
    }

    public double square_root(double number){
        return Math.sqrt(number);
    }
}
