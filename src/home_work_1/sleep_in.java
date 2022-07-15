package home_work_1;

import java.util.Scanner;

public class sleep_in {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сегодня рабочий день? ");
        String answer_1 = in.nextLine();

        switch (answer_1) {
            case "да":
                System.out.println("Не спи, нужно вставать на работу...");
                break;
            case "нет":
                System.out.println("У тебя отпуск?");
                String answer_2 = in.nextLine();
                switch (answer_2) {
                    case "да":
                        System.out.println("Можно спать дальше");
                        break;
                    case "нет":
                        System.out.println("У тебя выходной, можешь спать)");
                        break;
                }
                break;
            default:
                System.out.println("Проснись и ответь нормально.");
        }
    }
}
