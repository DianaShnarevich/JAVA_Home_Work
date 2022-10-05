package home_work_1.branching_operators;

import java.util.Scanner;

public class ByteTranslation {
    private double answer;

    private final double conver = 1024;

    public ByteTranslation(long answer) {
        this.answer = answer;
    }

    public double getByteTranslation(){
       return answer/conver;

    }
}
