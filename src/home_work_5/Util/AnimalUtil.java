package home_work_5.Util;

import java.util.*;

public class AnimalUtil {
    private static final List<String> nicks = new ArrayList<>(Arrays.asList("Tesla", "Gabi", "Businka", "Sharik",
            "Tuzik", "Bobik", "Dasya", "Raychel", "Bim"));

    private static final String symbols = "1234567890!@#$%^&*()_+№;:?-=ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final String rusSymbols = "АБВГДЕЁЖЗИЙКЛМНОПКРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";


    public static String randomNick() {
        return Util.createRandom(symbols);
    }

    public static String randomRusNick() {
        return Util.createRandom(rusSymbols);
    }


    public static String randomRealNick() {
        return Util.createRandomReal(nicks);
    }


    public static String randomNickFromFile() {
        return Util.createRandomFromFile("Nick.rtf");
    }


    public static int randomAge() {
        Random random = new Random();
        return 1 + random.nextInt(14);
    }


    public static int checkAge(int age) {
        int maxAge = 15;
        int minAge = 1;
        if (age > maxAge) {
            System.out.println("Возраст слишком большой");
            return 15;
        } else if (age < minAge) {
            System.out.println("Возвраст слишком маленький");
            return 1;
        } else {
            return age;
        }
    }
}
