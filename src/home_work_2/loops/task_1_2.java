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
        String num = Integer.toString(number);
        long result = 1;

        int[] array = new int[num.length()];

        for (int i = array.length - 1; i >= 0 ; i--) {
            if (number > 9) {
                array[i] = number % 10;
                number = number / 10;
            } else {
                array[i] = number;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(" * " + array[i]);
                result *= array[i];
            }
            if (i == 0){
                System.out.print(array[i]);
                result *= array[i];
            }
        }
        return result;
    }
}


