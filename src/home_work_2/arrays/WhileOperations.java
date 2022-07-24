package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class WhileOperations implements IArraysOperation {
    public static void main(String[] args) {
        WhileOperations wwhile = new WhileOperations();

        System.out.println("Элементы массива: " + wwhile.cycleWhile_all(ArraysUtils.arrayFromConsole()));
        System.out.println("Каждый второй элемент массива: "
                + wwhile.cycleWhile_Second(ArraysUtils.arrayFromConsole()));
        System.out.println("Массив в обратном порядке: " + wwhile.cycleWhile_Reverse(ArraysUtils.arrayFromConsole()));
    }
}
