package home_work_4.home_work_3.calcs.simple;

import home_work_4.home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double addition(double num1, double num2){
        return num1 + num2;
    }

    public double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public double division(double num1, double num2){
        return num1 / num2;
    }

    public double exponentiation(double number, int degree) {
        if (number < 0) {
            System.out.println("Возводимое число только положительное!");
        }
        return Math.pow(number, degree);
    }

    public double module(double number){
        return Math.abs(number);
    }

    public double square_root(double number){
        return Math.sqrt(number);
    }
}
