package home_work_6.Task8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String folderNameResult = "HomeWork/src/home_work_6/Task8";
        String folderName;
        String word;
        List<String> list;
        Search search = new Search();
        boolean searchWord = true;
        do {
            System.out.println("\"Укажите путь к папке(Пример: D:\\\\java_course\\\\JD1\\\\HomeWork\\\\src\\\\home_work_6\\\\Task7\\\\Books\"");
            folderName = scanner.nextLine();
            list = search.searchFolder(folderName);
        } while (list == null);
        System.out.println("Введите искомое слово");
        word = scanner.nextLine();
        search.searchWord(list, folderName, word, folderNameResult);
        while (searchWord) {
            System.out.println("Искать другое слово? (Да, Нет)");
            String searchWordScanner = scanner.nextLine();
            if (searchWordScanner.equals("Да")) {
                System.out.println("Введите искомое слово");
                word = scanner.nextLine();
                search.searchWord(list, folderName, word, folderNameResult);
            } else if (searchWordScanner.equals("Нет")) {
                searchWord = false;
            }
        }
        System.out.println(Main.readBook(folderNameResult));
    }

    public static String readBook(String folderNameResult) {
        String book;
        try {
            book = Files.readString(Path.of(folderNameResult + "/" + "result.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return book;
    }
}
