package home_work_2.loops;
import java.util.Scanner;

public class task_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        System.out.println("Результат после переполнения: " + funclong(number));
        System.out.println("Другой вариант решения с помощью try, catch ");
        System.out.println("Результат после переполнения: " + tryexc(number));


    }

    public static long funclong(int number) { // пока не придумала как сделать правильный вывод...
        long result = 1;
        long real_result = 0;
        for (int i = number; ; ) {
            result *= i;
            if (result < 0) {
                System.out.println("Результат до переполнения " + real_result);
                break;
            }
            real_result = result;
        }
        return result;
    }

    public static long tryexc(int number) { //правильно работает
        long result_bef = 1;
        long result_aft = 0;
        for (; ; ) {
            try {
                result_bef = Math.multiplyExact(result_bef, number);
                result_aft = result_bef;
            } catch (ArithmeticException e1) {
                System.out.println("Результат перед переполнением : " + result_bef / number);
                System.out.println("Результат после переполнения: " + result_aft);
                break;
            }
        }
        return tryexc(1);
    }
}