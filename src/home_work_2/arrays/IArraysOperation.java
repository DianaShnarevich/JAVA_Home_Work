package home_work_2.arrays;

public interface IArraysOperation {

    default StringBuilder cycleDoWhile_all(int[] array) {
        StringBuilder string = new StringBuilder();
        int i = 0;
        do {
            string.append(array[i] + " ");
            i++;
        } while (i < array.length);
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleWhile_all(int[] array) {
        StringBuilder string = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            string.append(array[i] + " ");
            i++;
        }
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleFor_all(int[] array) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            string.append(array[i] + " ");
        }
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleForEach_all(int[] array) {
        StringBuilder string = new StringBuilder();
        for (int element : array) {
            string.append(element + " ");
        }
        string.setLength(string.length() - 1);
        return string;
    }


    default StringBuilder cycleDoWhile_Second(int[] array) {
        StringBuilder string = new StringBuilder();
        int i = 0;
        do {
            if (i % 2 != 0 && i != 0) {
                string.append(array[i] + " ");
            }
            i++;
        } while (i < array.length);
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleWhile_Second(int[] array) {
        StringBuilder string = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            if (i % 2 != 0 && i != 0) {
                string.append(array[i] + " ");
            }
            i++;
        }
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleFor_Second(int[] array) {
        StringBuilder string = new StringBuilder();
        for (int i = 1; i < array.length; ) {
            string.append(array[i] + " ");
            i += 2;
        }
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleForEach_Second(int[] array) {
        StringBuilder string = new StringBuilder();
        int count = 1;
        for (int element : array) {
            if (count % 2 == 0) {
                string.append(element + " ");
            }
            count++;
        }
        string.setLength(string.length() - 1);
        return string;
    }


    default StringBuilder cycleDoWhile_Reverse(int[] array) {
        StringBuilder string = new StringBuilder();
        int i = array.length - 1;
        do {
            string.append(array[i] + " ");
            i--;
        } while (i >= 0);
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleWhile_Reverse(int[] array) {
        StringBuilder string = new StringBuilder();
        int i = array.length - 1;
        while (i >= 0) {
            string.append(array[i] + " ");
            i--;
        }
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleFor_Reverse(int[] array) {
        StringBuilder string = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            string.append(array[i] + " ");
        }
        string.setLength(string.length() - 1);
        return string;
    }

    default StringBuilder cycleForEach_Reverse(int[] array) {
        StringBuilder string = new StringBuilder();
        int j = array.length - 1;
        for (int i : array) {
            string.append(array[j] + " ");
            j--;
        }
        string.setLength(string.length() - 1);
        return string;
    }
}
