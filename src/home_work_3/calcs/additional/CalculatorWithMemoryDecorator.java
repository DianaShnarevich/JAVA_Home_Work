package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private final ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    private double lastOperationResult;

    private double memory;

    private long counter = 0;

    private void incrementCountOperation() {
        counter++;
    }

    private void addLastOperationResult(double result) {
        lastOperationResult = result;
    }

    public void addMemory() {
        memory = lastOperationResult;
    }

    public double getMemory() {
        double tmp = memory;
        memory = 0;
        return tmp;
    }

    public long getCountOperation() {
        return counter;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    @Override
    public double addition(double num1, double num2) {
        return 0;
    }

    public double subtraction(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.subtraction(x, y));
        return calculator.subtraction(x, y);
    }

    public double multiplication(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.multiplication(x, y));
        return calculator.multiplication(x, y);
    }

    public double division(double x, double y) {
        incrementCountOperation();
        addLastOperationResult(calculator.division(x, y));
        return calculator.division(x, y);
    }

    public double exponentiation(double x, int y) {
        incrementCountOperation();
        addLastOperationResult(calculator.exponentiation(x, y));
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
}
