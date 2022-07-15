package home_work_1.branching_operators;

import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number");
        int num2 = in.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("The number 1 is divided by the number 2");
        } else if (num2 % num1 == 0) {
            System.out.println("The number 2 is divided by the number 1");
        } else {
            System.out.println("The entered numbers are not divisible by each other");
        }
            
    }
}

