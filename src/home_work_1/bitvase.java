package home_work_1;

import java.util.Scanner;

public class bitvase {
    public static int main(int number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте длинну номера(10)");
        number = in.nextInt();

        if (number > 0) {
            return positiveByteNumber(number);
        }
//        else {
//            return negativeByteNumber(number);
//        }
        return number;
    }
    
    
    public static int positiveByteNumber(int number){
        int result, i = 1, k;
        int[] array = new int[100];

        result = number;

        while (result != 0) {
            array[i++] = result % 2;
            result = result / 2;
        }
        System.out.print("Число в двоичном виде: ");
        for (k = i - 1; k > 0; k--) {
            System.out.print(array[k]);
        }
        return result;
    }
    
    public static String negativeByteNumber(int number){
        String str = String.valueOf(positiveByteNumber(number));
        char[] arrayChar = str.toCharArray();
        for (int i = 0; i < arrayChar.length; i++){
        if (arrayChar[i] == '0'){
                arrayChar[i] = '1';
            } else {
                arrayChar[i] = '0';
            }
    }
        return String.valueOf(arrayChar);
    }
}
