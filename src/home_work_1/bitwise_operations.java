package home_work_1;

import java.util.Scanner;

public class bitwise_operations {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: "); // пользователь вводит первое число
        int num1 = in.nextInt(); //строчка считывает и возвращает наше значение
        System.out.print("Input a second number"); // пользователь вводит второе число
        int num2 = in.nextInt();
//числа 16(00010000) и 14(00001110)
        int result_1 = num1 | num2; //побитовый или == 30(0001 1110) отдает приоритет значению '1'
        int result_2 = num1 & num2; //побитовый и == 0(0000 0000) отдает приоритет значению '0'
        System.out.println(result_1);
        System.out.println(result_2);
        in.close();
        // При вводе числа 42.5 компиляция не выполняется. т.к. введен другой тип данных(в данном случае вещественный).
        // Побитовые операции выполняются только с целыми числами

    }


}
