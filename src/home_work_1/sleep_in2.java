package home_work_1;

import java.util.Scanner;

public class sleep_in2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Сегодня рабочий день?");
        String week = in.nextLine();
        boolean weekday = week.equals("да");
        System.out.println("Сегодня отпуск?");
        String vac = in.nextLine();
        boolean vacation = vac.equals("да");

        if (sleepIn(weekday, vacation)){
            System.out.println("Спи дальше");
        }
        else {
            System.out.println("Вставай, а то останешься без работы");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation){

        return !weekday || vacation;
    }
}
