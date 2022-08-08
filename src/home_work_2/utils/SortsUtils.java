package home_work_2.utils;

public class SortsUtils {
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = arr.length - 1; j > i; j--){
                if (arr[j - 1] > arr[j]){
                    int a = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = a;
                }
            }
        }
    }

    public static void shake(int[] arr){
        int a = 0;
        int b = arr.length - 1;
        int count = 1;
        while (count > 0){
            count = 0;
            for (int i = a; i < b; i++) {
                if (arr[i] > arr[i + 1]){
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    count = 1;
                }
            }
            b--;
            for (int i = b; i > a ; i--) {
                if (arr[i] < arr[i - 1]){
                    int x = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = x;
                    count = 1;
                }
            }
            a++;
        }

    }
}