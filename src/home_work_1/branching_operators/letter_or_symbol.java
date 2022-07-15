package home_work_1.branching_operators;

import java.util.Scanner;

public class letter_or_symbol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input symbol: ");
        String character = in.next();
        char c = character.charAt(0);

        if (Character.isLetter(c)){
            System.out.println("'" + c + "'" + "is letter");
        } else {
            System.out.println("'" + c + "'" + " is symbol");
        }
    }
}
