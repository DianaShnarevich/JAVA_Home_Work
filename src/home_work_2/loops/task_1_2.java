package home_work_2.loops;

import java.util.Scanner;

public class task_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (in.hasNextInt()) {
            int number = in.nextInt();
            System.out.println(" = " + func(number));
        } else if (in.hasNextDouble()) {
            System.out.print("Введено не целое число");
        } else if (in.hasNextLine()) {
            System.out.print("Введено не число");
        }
    }

    public static long func(int number) {
        int result = 1;
        while (number != 0) {
            long i = number % 10;

            if (number > 10) {
                System.out.print(i + " * ");
            }
            if (number < 10){
                System.out.print(number);
            }
            number = number / 10;

            result *= i;
        }
        return result;
    }
}


