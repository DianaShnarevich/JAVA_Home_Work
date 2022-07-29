package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double exponentiation(double num1, double num2){
        return Math.pow(num1, num2);
    }

    @Override
    public double modul(double number) {
        return 0;
    }

    @Override
    public double square_root(double number){
        return Math.sqrt(number);
    }




}
