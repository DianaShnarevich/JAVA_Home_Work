package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForOperations implements IArraysOperation {
    public static void main(String[] args) {
        ForOperations ffor = new ForOperations();

        System.out.println("Элементы массива: " + ffor.cycleDoWhile_all(ArraysUtils.arrayFromConsole()));
        System.out.println("Каждый второй элемент массива: "
                + ffor.cycleDoWhile_Second(ArraysUtils.arrayFromConsole()));
        System.out.println("Массив в обратном порядке: " + ffor.cycleDoWhile_Reverse(ArraysUtils.arrayFromConsole()));
    }
}
