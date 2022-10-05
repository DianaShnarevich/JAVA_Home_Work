package home_work_2.loops;

public class Task_1_3 {
    private double number;
    private double degree;

    public Task_1_3(double number, double degree){
        this.number = number;
        this.degree = degree;
    }

    public double degreefunc(){
        int i = 1;
        double result = number;

        while (i < degree){
            result = result * number;
            i++;
        }
        return result;
    }
}
