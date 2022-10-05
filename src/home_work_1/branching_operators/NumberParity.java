package home_work_1.branching_operators;

public class NumberParity {
    private int a;

    public NumberParity(int a) {
        this.a = a;
    }

    public String numberParity(){
        if (a % 2 == 0)
            return "The number " + a + " is even";
        else
            return "The number " + a + " is odd";

    }
}
