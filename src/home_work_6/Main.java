package home_work_6;

import home_work_6.SearchEngine.Decorator;
import home_work_6.SearchEngine.EasySearch;

public class Main {
    public static void main(String[] args) {


        EasySearch search = new EasySearch();
        Decorator decorator = new Decorator(search);
        String x = Util.converting("HomeWork/src/home_work_6/WarAndPeace.txt");

        System.out.print("Слово \"война\" с учетом регистра встречалось ");
        System.out.print(search.search(x, "война") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"война\" без учёта регистра встречалось ");
        System.out.print(decorator.search(x, "война") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"и\" с учетом регистра встречалось ");
        System.out.print(search.search(x, "и") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"и\" без учёта регистра встречалось ");
        System.out.print(decorator.search(x, "и") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"мир\" с учетом регистра встречалось ");
        System.out.print(search.search(x, "мир") + " раз(-а)");
        System.out.println();

        System.out.print("Слово \"мир\" без учёта регистра встречалось ");
        System.out.print(decorator.search(x, "мир") + " раз(-а)");
        System.out.println();
    }
}
