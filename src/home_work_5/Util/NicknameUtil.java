package home_work_5.Util;

public class NicknameUtil {
    private static final String symbols = "1234567890!@#$%^&*()_+№;:?-=ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final String engSymbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String randomNick() {
        return Util.createRandom(symbols);
    }


    public static String randomEngNick() {
        return Util.createRandom(engSymbol);
    }


    public static String randomNickFromFile() {
        return Util.createRandomFromFile("NickPerson.rtf");
    }
}
