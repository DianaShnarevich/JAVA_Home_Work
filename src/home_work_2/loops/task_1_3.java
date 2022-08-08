package home_work_2.loops;

import java.util.Scanner;

public class task_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое хотите возвести в n-ую степень: ");
        double number = in.nextDouble();

        System.out.println("Введите значение степени");
        if (in.hasNextInt()) {
            int degree = in.nextInt();
            if (degree > 0) {
                System.out.println(number + "^" + degree + "=" + degreefunc(number, degree));
            } else {
                System.out.println("Степень может быть только положительной.");
            }
        }else if (in.hasNextDouble()){
                System.out.print("Степень может быть только целой!");
        } else {
            System.out.println("Введено не число!!!");
        }
    }
    public static  double degreefunc(double number, double degree){
        int i = 1;
        double result = number;

        while (i < degree){
            result = result * number;
            i++;
        }
        return result;
    }
}
