package home_work_5.Util;

import java.util.*;

public class PersonUtil {
    private static final List<String> names = new ArrayList<>(Arrays.asList("Diana", "Kate", "Sasha", "Dasha",
            "Roma", "Aleksey", "Dima", "Evgeniy", "Artem"));

    private static final String symbols = "1234567890!@#$%^&*()_+№;:?-=ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final String rusSymbols = "АБВГДЕЁЖЗИЙКЛМНОПКРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    private static final String engSymbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String randomName() {
        return Util.createRandom(symbols);
    }


    public static String randomRusName() {
        return Util.createRandom(rusSymbols);
    }


    public static String randomRealName() {
        return Util.createRandomReal(names);
    }


    public static String randomNameFromFile() {
        return Util.createRandomFromFile("Name.rtf");
    }


    public static String password() {
        Random random = new Random();
        int passwordLength = 5 + random.nextInt(5);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int symbolIndex = (int) (symbols.length() * Math.random());
            builder.append(symbols.charAt(symbolIndex));
        }
        return builder.toString();
    }


    public static String checkPassword(String password) {
        int length = password.length();
        if (length > 10) {
            int count = length - 10;
            System.out.println("Пароль не может состоять из более 10 символов. Последние " + count + " символа удалены.");
            return password.substring(0, 9);
        } else if (length < 5) {
            int count = 5 - length;
            String builder = password +
                    "0".repeat(count);
            System.out.println("Пароль должен состоять из не менее 5 символов. В конце добавлены " + count + " 0.");
            return builder;
        } else {
            return password;
        }
    }




}

