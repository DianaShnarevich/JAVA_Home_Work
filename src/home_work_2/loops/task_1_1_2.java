package home_work_2.loops;

import java.util.Scanner;

public class task_1_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int number = in.nextInt();

        System.out.print("1");
        long result = recursion(number);
        System.out.print(" = " + result);
    }
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
