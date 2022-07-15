package home_work_1.branching_operators;

import java.util.Scanner;

public class average_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num_1 = in.nextInt();
        System.out.print("Input second number: ");
        int num_2 = in.nextInt();
        System.out.print("Input first number: ");
        int num_3 = in.nextInt();

        int average = (num_1 + num_2 + num_3)/3;
        System.out.println(average);
        in.close();


    }
}
