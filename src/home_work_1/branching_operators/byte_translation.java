package home_work_1.branching_operators;

import java.util.Scanner;

public class byte_translation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Select an operation (translate 'bytes=1' or 'kilobytes=2': ");
        int answer = in.nextInt();

        if (answer == 1){
            System.out.println("Input a number to convert to bytes : ");
            int ansver_byte = in.nextInt();
            System.out.println("Bytes " + (ansver_byte * 1024));
        }
        if (answer == 2){
            System.out.println("Input a number to convert to kilobytes :");
            int ansver_kilobyte = in.nextInt();
            System.out.println("Kilobytes " + (ansver_kilobyte / 1024));
        }

    }
}
