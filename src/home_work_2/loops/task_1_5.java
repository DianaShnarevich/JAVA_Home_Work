package home_work_2.loops;

import java.util.Arrays;
import java.util.Scanner;

public class task_1_5 {
    public static void main(String[] args) {

    }

    public static int maxnum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = in.nextInt();

//        int[] array = new int[];

        while (number > 0) {
            double i = number % 10;
            number = number / 10;
        }
        return number;

    }

}
