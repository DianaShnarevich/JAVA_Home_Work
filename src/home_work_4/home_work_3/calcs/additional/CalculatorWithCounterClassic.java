package home_work_4.home_work_3.calcs.additional;

import home_work_4.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    public long count = 0;

    public void incrementCountOperation(){
        count++;
    }

    public long getCountOperation() {
        return count;
    }
}
