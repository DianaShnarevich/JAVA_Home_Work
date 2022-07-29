package home_work_3.calcs.simple;


import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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

    public double exponentiation(double number, int degree){
        double result = number;
        if (number > 0) {
            while (degree > 1) {
                result *= number;
                degree--;

            }
            return result;
        } else {
            System.out.println("Возвести в степень можно только положительное число!");
            return 0;
        }
    }

    public double module(double number){
        if (number < 0){
            number = number * (-1);
        }
        return number;
    }

    public double square_root(double number){
        return Math.sqrt(number);
    }
}
