package home_work_1.branching_operators;

import java.util.Scanner;

public class number_parity {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();

        if (a % 2 == 0)
            System.out.println("The number " + a + " is even");
        else
            System.out.println("The number " + a + " is odd");

    }
}
