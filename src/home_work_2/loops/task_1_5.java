package home_work_2.loops;
import java.util.Random;
import java.util.Scanner;

public class task_1_5 {
    public static void main(String[] args) {
        System.out.println("Наибольшая цифра натурального числа: " + task_1_5_1());
        System.out.println("Вероятность выпадения четного числа: " + task_1_5_2() + "%");
        System.out.println("Нечетных цифр: " + task_1_5_3());
        System.out.println("Ряд Фибоначчи : " + task_1_5_4());
        System.out.println("Диапозон чисел c шагом: " + task_1_5_5());
        System.out.println("Перевернутое число: " + task_1_5_6());
    }

    public static int task_1_5_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = in.nextInt();
        int max = 0;

        while (number > 0) {
            if (number % 10 > max) max = (number % 10);
            number = number / 10;
        }
        return max;
    }

    public static float task_1_5_2(){
        float probability = 0;

        int[] array = new int[1000];
        Random number = new Random();
        for (int i = 0; i < 1000; i++){
            array[i] = number.nextInt();
            if (array[i] % 2 == 0){
                probability += 1;
            }
        }
        probability = probability / 10;

        return probability;
    }

    public static int task_1_5_3(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int even = 0;
        int odd = 0;


        while (number > 0) {
            if (number % 2 == 0) {
            even += 1;
            } else {
                odd += 1;
            }
            number = number / 10;
        }
        System.out.println("Четных цифр: " + even);
        return odd;

    }

    public static String task_1_5_4(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов в ряду: ");
        int number = in.nextInt();

        int num1 = 1;
        int num2 = 2;
        String result = " ";

        if (number == 1) {
            result += num1;
        }else {
            number = number - 2;

            result += num1 + " " + num2;
            for (int i = 0; i < number; i++) {
                if (i % 2 == 0) {
                    num1 += num2;
                    result += " " + num1;
                } else {
                    num2 += num1;
                    result += " " + num2;
                }
            }
        }
        return result;
    }

    public static String task_1_5_5(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите минимальное значение: ");
        int min = in.nextInt();
        System.out.print("Введите максимальное значение: ");
        int max = in.nextInt();
        System.out.print("Введите шаг: ");
        int num = in.nextInt();
        String result = "";

        int count = min;

        while (count <= max){
            result += " " + count;
            count += num;
        }
        return result;
    }

    public static String task_1_5_6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое хотите перевернуть: ");
        int number = in.nextInt();
        int revers = 0;
        String result = "";

        while (number > 0){
            result += number % 10;
            number = number / 10;
        }
        return result;
    }
}
