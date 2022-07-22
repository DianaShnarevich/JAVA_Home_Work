package home_work_2.arrays;


import home_work_2.utils.ArraysUtils;

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
        System.out.println(task_2_4_5(ArraysUtils.arrayRandom(50, 100)));
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
                string.append(i + " ");
            }
        }
        string.setLength(string.length() - 1);
        return string;
    }

    public static StringBuilder task_2_4_4(int[] array) {
        StringBuilder string = new StringBuilder();
        int min_1 = Integer.MAX_VALUE;
        int min_2 = Integer.MAX_VALUE - 1;

        for (int element : array) {
            if (element < min_1) {
                min_2 = min_1;
                min_1 = element;
            }
        }
        string.append("Два наименьших значения : " + min_1 + " и " + min_2);
        return string;
    }

    public static int[] task_2_4_5(int[] array) {
        int min = 12;
        int max = 19;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
           if (array[i] >= min && array[i] <= max){
               count++;
               for (int j = i; j < array.length - 1; j++) {
                   array[j] = array[j + 1];
               }
               array[array.length - count] = 0;
               i--;
           }
        }
        return array;
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



