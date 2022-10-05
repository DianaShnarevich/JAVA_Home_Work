package home_work_1.branching_operators;

public class Divisibility {
     private  int num1;
     private  int num2;

     public Divisibility(int num1, int num2) {
         this.num1 = num1;
         this.num2 = num2;
     }

     public String getAnswer() {
        if(num1 == 0 || num2 == 0){
            return "You can't divide by zero!";
        }else if (num1 % num2 == 0) {
            return "The number 1 is divided by the number 2";
        } else if (num2 % num1 == 0) {
            return "The number 2 is divided by the number 1";
        }
        return "The entered numbers are not divisible by each other";
    }
}

