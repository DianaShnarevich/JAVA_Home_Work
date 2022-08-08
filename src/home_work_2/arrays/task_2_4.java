package home_work_2.arrays;


import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class task_2_4 {
    public static void main(String[] args) {
        System.out.println("Сумма четных положительных элементов массива");
        System.out.println(task_2_4_1(ArraysUtils.arrayRandom(50, 100)));

        System.out.println("Максимальный из элементов массива с четными индексами");
        System.out.println(task_2_4_2(ArraysUtils.arrayRandom(50, 100)));

        System.out.println("Элементы массива, которые меньше среднего арифметического");
        System.out.println(task_2_4_3(ArraysUtils.arrayRandom(50, 100)));

        System.out.println("Два наименьших (минимальных) элемента массива");
        System.out.println(task_2_4_4(ArraysUtils.arrayRandom(50, 100)));

        System.out.println("Сжатый массив");
        System.out.println(task_2_4_5());

        System.out.println("Сумма цифр массива");
        System.out.println(task_2_4_6(ArraysUtils.arrayRandom(50, 100)));
    }

    public static int task_2_4_1(int[] array) {
        int sum = 0;

        for (int i : array) {
            if (i % 2 == 0 && i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int task_2_4_2(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static StringBuilder task_2_4_3(int[] array) {
        StringBuilder string = new StringBuilder();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        int average = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if (i < average) {
                string.append(i).append(" ");
            }
        }
        string.setLength(string.length() - 1);
        return string;
    }

    public static StringBuilder task_2_4_4(int[] array) {
        StringBuilder string = new StringBuilder();
        int min_1 = array[0];
        int min_2 = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (min_1 > array[i]) {
                min_1 = array[i];
                index = i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (min_2 > array[j] && j != index) {
                min_2 = array[j];
            }
        }

       // System.out.println(Arrays.toString(array));
        System.out.println("Первый минимальный элемент " + min_1);
        System.out.println("Второй минимальный элемент " + min_2);
        return string;
    }

    public static String task_2_4_5() {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        int min = 12;
        int max = 19;
        for (int i = 0; i < array.length; i++) {
           if (array[i] >= min && array[i] <= max) {
               array[i] = 0;
           }
        }
        return Arrays.toString(array);

    }

    public static StringBuilder task_2_4_6(int[] array) {
        StringBuilder string = new StringBuilder();
        int summ = 0;

        for (int i : array) {
            if (i > 9) {
                int num_1 = i / 10;
                int num_2 = i % 10;
                if (num_1 <= 9) {
                    summ += num_1 + num_2;
                }
                if (num_1 > 9) {
                    int x = num_1 / 10;
                    int y = num_1 % 10;
                    summ += x + y + num_2;
                }
            } else {
                summ += i;
            }
        }
        string.append(summ);
        return string;
    }
}



