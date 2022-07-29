package home_work_3.calcs.simple;

import java.util.Scanner;

public class prob {
    public static void main(String[] args) {
        double number = 5.6;
        int degree = 2;

        double result = number;
        while ( degree > 1){
            --degree;
            result *= number;
        }
        System.out.println(result);
    }
}
