package home_work_1.your_name;

import java.util.Scanner;

public class name_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
