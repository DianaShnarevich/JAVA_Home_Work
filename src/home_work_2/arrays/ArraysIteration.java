package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysIteration {
    public static void main(String[] args) {
        System.out.println("Все элементы массива: ");
        task_1(ArraysUtils.arrayFromConsole());
        System.out.println(" ");
        System.out.println("Каждый второй элемент массива: ");
        task_2(ArraysUtils.arrayFromConsole());
        System.out.println(" ");
        System.out.println("Массив в обратном порядке: " );
        System.out.println(" ");
        task_3(ArraysUtils.arrayFromConsole());
    }

    public static void task_1(int[] arrayFromConsole) {
        System.out.print("Цикл do... while:  ");

        int i = 0;
        do {
            System.out.print(arrayFromConsole[i++] + " ");
        } while (i < arrayFromConsole.length);


        System.out.println(" ");
        System.out.print("Цикл while:  ");

        i = 0;
        while (i < arrayFromConsole.length){
            System.out.print(arrayFromConsole[i++] + " ");
        }


        System.out.println(" ");
        System.out.print("Цикл for :  ");

        for (int j = 0; j < arrayFromConsole.length; j++) {
            System.out.print(" " + arrayFromConsole[j]);
        }
        System.out.println(" ");
        System.out.print("Цикл foreach :  ");

        for (int number : arrayFromConsole){
            System.out.print(" " + number);
        }

    }

    public static void task_2(int[] arrayFromConsole){
        int i = 0;
        int[] array1 = arrayFromConsole;

        System.out.println(" ");
        System.out.print("Цикл do... while:  ");
        do {
            if (i % 2 != 0 && i != 0){
                System.out.print(array1[i] + " ");
            }
            i++;
        } while (i < array1.length);

        System.out.println(" ");
        System.out.print("Цикл while:  ");
        i = 0;
        while (i < array1.length){
            if (i % 2 != 0 && i != 0){
                System.out.print(array1[i] + " ");
            }
            i++;
        }

        System.out.println(" ");
        System.out.print("Цикл for:  ");
        for (int j = 1; j <= arrayFromConsole.length - 1;) {
            if (j + 1 == arrayFromConsole.length || j + 2 == arrayFromConsole.length){
                System.out.println(arrayFromConsole[j]);
                break;
            } else {
                System.out.println(arrayFromConsole[j] + " ");
                j = j + 2;
            }
        }

        System.out.print("Цикл foreach:  ");
        int count = 1;
        for (int j : array1){
            if (count % 2 == 0){
                System.out.print(j + " ");
            }
            count++;
        }
    }

    public static void task_3(int[] arrayFromConsole){



        System.out.println(" ");
        System.out.print("Цикл do... while: ");

        int i = arrayFromConsole.length - 1;
        do {
            System.out.print(arrayFromConsole[i--] + " ");
        } while (i >= 0);


        System.out.println(" ");
        System.out.print("Цикл while: ");

        i = arrayFromConsole.length - 1;
        while (i >= 0){
            System.out.print(arrayFromConsole[i--] + " ");
        }


        System.out.println(" ");
        System.out.print("Цикл for: ");

        for (int j = arrayFromConsole.length - 1; j >= 0 ; j--) {
            System.out.print(arrayFromConsole[j] + " ");
        }


        System.out.println(" ");
        System.out.print("Цикл foreach: ");

        ArrayList<Integer> array = new ArrayList<>();
        for (int number : arrayFromConsole) {
            array.add(number);
        }
        Collections.reverse(array);
        for (int numbers : array){
            System.out.print(numbers + " ");
        }

    }
}
