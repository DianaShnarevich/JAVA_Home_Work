package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private final ICalculator calculator;

    private long counter;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    @Override
    public double adding(double x, double y) {
        incrementCountOperation();
        return calculator.addition(x, y);
    }

    @Override
    public double addition(double x, double y) {
        incrementCountOperation();
        return calculator.addition(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        incrementCountOperation();
        return calculator.subtraction(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        incrementCountOperation();
        return calculator.multiplication(x, y);
    }

    @Override
    public double division(double x, double y) {
        incrementCountOperation();
        return calculator.division(x, y);
    }

    @Override
    public double exponentiation(double x, int y) {
        incrementCountOperation();
        return calculator.exponentiation(x, y);
    }

    @Override
    public double module(double number) {
        return 0;
    }

    @Override
    public double square_root(double number) {
        return 0;
    }

    @Override
    public double numberModulus(double x) {
        incrementCountOperation();
        return calculator.module(x);
    }

    @Override
    public double squareRoot(double x) {
        incrementCountOperation();
        return calculator.square_root(x);
    }
}
