package Test.hw2;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortUtilsTest {
    private final int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
    private final int[] array2 = new int[]{1, 1, 1, 1};
    private final int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
    private final int[] array4 = new int[]{};
    private final int[] array5 = new int[]{6, 5, 4, 3, 2, 1};


    private final int[] array6 = new int[]{12, 4, 6, 2, 0, 93, 2};
    private final int[] array7 = new int[]{7, 3, 9, 1};
    private final int[] array8 = new int[]{0, 0, 0, 0, 0};

    @Test
    public void bubble1() {
        SortsUtils.bubble(array1);
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 8, 9}, array1);
        SortsUtils.bubble(array2);
        Assertions.assertArrayEquals(new int[]{9, 9, 9, 9, 9}, array2);
        SortsUtils.bubble(array3);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, array3);
        SortsUtils.bubble(array4);
        Assertions.assertArrayEquals(new int[]{}, array4);
        SortsUtils.bubble(array5);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array5);
        SortsUtils.bubble(array6);
        Assertions.assertArrayEquals(new int[]{0, 2, 2, 4, 6, 12, 93}, array6);
        SortsUtils.bubble(array7);
        Assertions.assertArrayEquals(new int[]{1, 3, 7, 9}, array7);
        SortsUtils.bubble(array8);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0}, array8);
    }

    @Test
    public void shake() {
        SortsUtils.shake(array1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array1);
        SortsUtils.shake(array2);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, array2);
        SortsUtils.shake(array3);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, array3);
        SortsUtils.shake(array4);
        Assertions.assertArrayEquals(new int[]{}, array4);
        SortsUtils.shake(array5);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array5);
        SortsUtils.shake(array6);
        Assertions.assertArrayEquals(new int[]{0, 2, 2, 4, 6, 12, 93}, array6);
        SortsUtils.shake(array7);
        Assertions.assertArrayEquals(new int[]{1, 3, 7, 9}, array7);
        SortsUtils.shake(array8);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0}, array8);
    }
}
