package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForEachOperations implements IArraysOperation {
    public static void main(String[] args) {
        ForEachOperations forEach = new ForEachOperations();

        System.out.println("Элементы массива: " + forEach.cycleDoWhile_all(ArraysUtils.arrayFromConsole()));
        System.out.println("Каждый второй элемент массива: "
                + forEach.cycleDoWhile_Second(ArraysUtils.arrayFromConsole()));
        System.out.println("Массив в обратном порядке: " + forEach.cycleDoWhile_Reverse(ArraysUtils.arrayFromConsole()));
    }
}
