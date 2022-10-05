package home_work_2.loops;

public class Task_1_1_1 {
    private double number;

    public Task_1_1_1(double number) {
        this.number = number;
    }

    public double array() {
        if (number <= 0) {
            return number;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

}
