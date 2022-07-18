package home_work_2.loops;

import java.util.Scanner;

public class task_1_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int number = in.nextInt();
        System.out.println(recurcion(number));
    }
    public static int recurcion(int num) {
        int result = 1;

        if (num == 0) {
            System.out.print(" = ");
            return result;
        }
        if (num == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(num);
        if (num != 2) {
            System.out.print(" * ");
        }

        result = num * recurcion(num - 1);
        return result;

    }
}
