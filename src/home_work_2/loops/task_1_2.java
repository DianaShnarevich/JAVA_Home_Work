package home_work_2.loops;

public class Task_1_2 {
    private int number;
    public Task_1_2(int number){
        this.number = number;
    }

    public long func() {
        String num = Integer.toString(number);
        long result = 1;

        int[] array = new int[num.length()];

        for (int i = array.length - 1; i >= 0 ; i--) {
            if (number > 9) {
                array[i] = number % 10;
                number = number / 10;
            } else {
                array[i] = number;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(" * " + array[i]);
                result *= array[i];
            }
            if (i == 0){
                System.out.print(array[i]);
                result *= array[i];
            }
        }
        return result;
    }
}


