package home_work_2.loops;

public class Task_1_1_2 {
    public static long recursion(int number) {

        long result = 1;

        if (number == 1 || number == 0){
            return result;
        }
        result = number * recursion(number - 1);
        System.out.print(" * " + number);
        if (result < 0){
            System.out.println("Произошло переполнение");
        }
        return result;
    }
}
