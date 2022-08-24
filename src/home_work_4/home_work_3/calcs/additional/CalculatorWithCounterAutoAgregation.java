package home_work_4.home_work_3.calcs.additional;

import home_work_4.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithMathCopy calculator;
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy fun) {
        this.calculator = fun;
    }
    private long count = 0;

    public void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }

    public double addition(double num1, double num2) {
        incrementCountOperation();
        return calculator.addition(num1, num2);
    }

    public double subtraction(double num1, double num2) {
        incrementCountOperation();
        return calculator.subtraction(num1, num2);
    }

    public double multiplication(double num1, double num2) {
        incrementCountOperation();
        return calculator.multiplication(num1, num2);
    }

    public double exponentiation(double num1, int degree) {
        incrementCountOperation();
        return calculator.exponentiation(num1, degree);
    }

    public double module(double number) {
        incrementCountOperation();
        return calculator.module(number);
    }

    public double square_root(double number){
        incrementCountOperation();
        return calculator.square_root(number);
    }
}
