package home_work_6;

import home_work_6.SearchEngine.Decorator;
import home_work_6.SearchEngine.EasySearch;

public class Main {
    public static void main(String[] args) {


        EasySearch easySearch = new EasySearch();
        Decorator unimportant = new Decorator(easySearch);
        String x = Util.converting("HomeWork/src/home_work_6/WarAndPeace.txt");

        System.out.print("Слово \"война\" с учетом регистра встречалось ");
        System.out.print(easySearch.search(x, "война") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"война\" без учёта регистра встречалось ");
        System.out.print(unimportant.search(x, "война") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"и\" с учетом регистра встречалось ");
        System.out.print(easySearch.search(x, "и") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"и\" без учёта регистра встречалось ");
        System.out.print(unimportant.search(x, "и") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"мир\" с учетом регистра встречалось ");
        System.out.print(easySearch.search(x, "мир") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"мир\" без учёта регистра встречалось ");
        System.out.print(unimportant.search(x, "мир") + " раз(-а)");
        System.out.println();
    }
}
