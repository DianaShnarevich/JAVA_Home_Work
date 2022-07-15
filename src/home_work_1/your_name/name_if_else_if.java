package home_work_1.your_name;

import java.util.Objects;
import java.util.Scanner;

public class name_if_else_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
