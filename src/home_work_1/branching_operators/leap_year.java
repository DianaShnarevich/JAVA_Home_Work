package home_work_1.branching_operators;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("This year is leap");
            }
        } else {
            System.out.println("This year is not a leap");
        }
    }
}
