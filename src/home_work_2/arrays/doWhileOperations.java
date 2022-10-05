package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class DoWhileOperations implements IArraysOperation {
    public static void main(String[] args) {
        DoWhileOperations doWhile = new DoWhileOperations();

        System.out.println("Элементы массива: " + doWhile.cycleDoWhile_all(ArraysUtils.arrayFromConsole()));
        System.out.println("Каждый второй элемент массива: "
                + doWhile.cycleDoWhile_Second(ArraysUtils.arrayFromConsole()));
        System.out.println("Массив в обратном порядке: " + doWhile.cycleDoWhile_Reverse(ArraysUtils.arrayFromConsole()));
    }

}
