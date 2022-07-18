package home_work_2.loops;

import java.util.Scanner;

public class task_1_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int number = in.nextInt();

        int result = 1;
        int i = 1;

        while (i < number) {
            if (number == 1){
                System.out.println(i + "=" + i);
                break;
            }else {
                System.out.print(i + "*");
                result *= ++i;
            }
        }
        System.out.println(i + "=" + result);
    }
}
