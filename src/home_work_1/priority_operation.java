package home_work_1;

public class priority_operation {

    public static void main(String[] args) {

        int b = 2;
        int a = 8;

        int result_1 = 5 + 2 / 8; // 5.25
        System.out.println(result_1); // Приоритет отдается делению, поэтому результат 5.25(т.к. result == int,
                                      // выведется 5(после округления)
        int result_2 = (5 + 2) / 8; // 0.875
        System.out.println(result_2); // Результат 0

        int result_3 = (5 + b++) / 8; // после сложения, значение b увеличивается на 1 единицу(постинкремент)
        System.out.println(result_3); // результат 0(0.875)

        int result_4 = (5 + b++) / --a; // после result_3 значение b = 3. a = 7
        System.out.println(result_4); // результат 1(1,1242...)

        a = 8;
        int result_5 = (5 * b >> b++) / --a; // b=4, (20>>4)/7    010100(20)  000001(1) /
        System.out.println(result_5); // результат 0(округление 0.142...)

        a = 8;
        int result_6 = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a; // b=5, т.к. 12>20->false-->22*2=44--->1/7
        // 44(0010 1100) 1(0000 0001)
        System.out.println(result_6); // результат 0(округление 0.142...)
/*
        *int result_7 = (5 + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --a; //ошибка в примере.
        *System.out.println(result_7); // нельзя выполнять математические операции над значениями boolean
*/
        boolean result_8 = 6 - 2 > 3 && 12 * 12 <= 119; // 4>3-->true, 144<=119-->false
        System.out.println(result_8); // результат false, т.к. для получения true оба операнда должны являться true

        boolean result_9 = true && false; // логический оператор 'И'
        System.out.print(result_9); // результат false, т.к. для получения true оба операнда должны являться true
    }
}

