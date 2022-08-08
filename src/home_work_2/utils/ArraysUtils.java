package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        arrayFromConsole();
        //arrayRandom(50, 100);
    }

    public static int[] arrayFromConsole(){
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте длинну масива :");
        int size = in.nextInt();

        int[] array = new int[size];
        System.out.print("Введите элементы массива :");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        for (int i = 0; i < size; i++) {
            String result = " " + array[i];
        }

        return array;
    }
}
