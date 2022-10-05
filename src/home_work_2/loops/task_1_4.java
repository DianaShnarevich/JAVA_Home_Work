package home_work_2.loops;

public class Task_1_4 {
    private int number;
    public Task_1_4(int number){
        this.number = number;
    }


    public long funcLong() {
        long result = 1;
        long real_result = 0;
        for (; ; ) {
            result *= number;
            if (result < 0) {
                System.out.println("Результат до переполнения " + real_result);
                break;
            }
            real_result = result;
        }
        return result;
    }

    public long tryExcept() { //правильно работает
        long result_bef = 1;
        long result_aft = 0;
        for (; ; ) {
            try {
                result_bef = Math.multiplyExact(result_bef, number);
                result_aft = result_bef;
            } catch (ArithmeticException e1) {
                System.out.println("Результат перед переполнением : " + result_bef / number);
                System.out.println("Результат после переполнения: " + result_aft);
                break;
            }
        }
        return tryExcept();
    }
}