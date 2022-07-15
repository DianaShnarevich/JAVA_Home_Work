package home_work_1;

import java.util.Scanner;

public class create_phone_number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте длинну номера(10)");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.println("Введите числа номера");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(createPhoneNumber(array));
    }

    public static String createPhoneNumber(int[] number) {
        String result = "(###) ###-####";
        for (int i : number) {
            result = result.replaceFirst("#", i + "");
        }
        return result;

    }
}
