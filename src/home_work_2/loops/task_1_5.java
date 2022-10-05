package home_work_2.loops;
import java.util.Random;

public class Task_1_5 {

    public int task_1_5_1(int number) {
        int max = 0;

        while (number > 0) {
            if (number % 10 > max) max = (number % 10);
            number = number / 10;
        }
        return max;
    }

    public float task_1_5_2(){
        float probability = 0;

        int[] array = new int[1000];
        Random number = new Random();
        for (int i = 0; i < 1000; i++){
            array[i] = number.nextInt();
            if (array[i] % 2 == 0){
                probability += 1;
            }
        }
        probability = probability / 10;

        return probability;
    }

    public int task_1_5_3(int number){

        int even = 0;
        int odd = 0;


        while (number > 0) {
            if (number % 2 == 0) {
            even += 1;
            } else {
                odd += 1;
            }
            number = number / 10;
        }
        System.out.println("Четных цифр: " + even);
        return odd;

    }

    public static int[] task_1_5_4(int count) {


        int num = 0;
        int num1 = 1;
        int num2;
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            num2 = num + num1;
            num = num1;
            num1 = num2;
            array[i] = num1;
        }
        return array;
    }

    public static int[] task_1_5_5(int min, int max, int num){
        int result = min;
        int i;
        for (i = 0; result <= max; i++) {
            result = result + num;
        }
        result = min;
        int[] array = new int[i];
        for (int j = 0; j < i; j++) {
            array[j] = result;
            result = result + num;
        }
        return array;
    }

    public String task_1_5_6(int number){
        StringBuilder result = new StringBuilder();

        while (number > 0){
            result.append(number % 10);
            number = number / 10;
        }
        return result.toString();
    }
}
