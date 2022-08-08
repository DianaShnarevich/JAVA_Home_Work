package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithCounterAutoSuper fun = new CalculatorWithCounterAutoSuper();

    public long getCountOperation() {
        return fun.count;
    }

    public double addition(double num1, double num2) {
        return fun.addition(num1, num2);
    }

    public double subtraction(double num1, double num2) {
        return fun.subtraction(num1, num2);
    }

    public double multiplication(double num1, double num2) {
        return fun.multiplication(num1, num2);
    }

    public double division(double num1, double num2) {
        return fun.division(num1, num2);
    }

    public double exponentiation(double num1, int degree) {
        return fun.exponentiation(num1, degree);
    }

    public double module(double number) {
        return fun.module(number);
    }

    public double square_root(double number) {
        return fun.square_root(number);
    }
}
