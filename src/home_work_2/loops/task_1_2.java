package home_work_2.loops;

import java.util.Scanner;

public class task_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (in.hasNextInt()){

            long number = in.nextInt();
            long result = 1;

            if (number < 10){
                System.out.println(number + " = " + number);
            }else {
                while (number != 0) {
                    long i = number % 10;
                    number = number / 10;
                    if (number < 10) {
                        System.out.print(" * " + i);
                    } else {
                        System.out.print(i);
                    }

                    result *= i;
                }
                System.out.print(" = " + result);
            }
        } else if (in.hasNextDouble()) {
            System.out.print("Введено не целое число");
        } else if (in.hasNextLine()){
            System.out.print("Введено не число");
        }
    }
}


