package home_work_3.calcs.simple;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long count = 0;

    public long getCountOperation() {
        return count;
    }

    @Override
    public double addition(double num1, double num2) {
        count++;
        return super.addition(num1, num2);
    }

    @Override
    public double subtraction(double num1, double num2) {
        count++;
        return super.subtraction(num1, num2);
    }

    @Override
    public double multiplication(double num1, double num2) {
        count++;
        return super.multiplication(num1, num2);
    }

    @Override
    public double division(double num1, double num2) {
        count++;
        return super.division(num1, num2);
    }

    @Override
    public double exponentiation(double num1, int num2) {
        count++;
        return super.exponentiation(num1, num2);
    }

    @Override
    public double module(double number) {
        count++;
        return super.modul(number);
    }

    @Override
    public double square_root(double number) {
        count++;
        return super.square_root(number);
    }
}
