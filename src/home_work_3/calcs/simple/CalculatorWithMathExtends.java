package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
<<<<<<< HEAD
=======

>>>>>>> 3e61d8f85841139d93849295fa0b3ed66af99194
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
