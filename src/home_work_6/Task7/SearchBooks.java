package home_work_6.Task7;

import home_work_6.Collections;
import home_work_6.SearchEngine.EasySearch;
import home_work_6.SearchEngine.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

public class SearchBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String folderNameResult = "homework/src/home_work_6/Task7";
        String folderName;
        String fileName;
        String word;
        SearchBooks search = new SearchBooks();
        do {
            System.out.println("Укажите путь к папке(Пример: D:\\java_course\\JD1\\HomeWork\\src\\home_work_6\\Task7\\Books");
            folderName = scanner.nextLine();
        } while (search.searchFolder(folderName));
        do {
            System.out.println("Введите название книги");
            fileName = scanner.nextLine();
        } while (search.searchFileName(folderName, fileName));
        boolean proceedSearchFile = true;
        while (proceedSearchFile) {
            boolean proceedSearchWord = true;
            System.out.println("Какое слово хотите найти? ");
            word = scanner.nextLine();
            search.searchWord(word, folderName, fileName, folderNameResult);
            while (proceedSearchWord) {
                System.out.println("Искать другое слово? (Да, Нет)");
                String searchWordScanner = scanner.nextLine();
                if (searchWordScanner.equals("Да")) {
                    System.out.println("Какое слово хотите найти? ");
                    word = scanner.nextLine();
                    search.searchWord(word, folderName, fileName, folderNameResult);
                } else if (searchWordScanner.equals("Нет")) {
                    proceedSearchWord = false;
                }
            }
            System.out.println("Желаете найти следующую книгу? (Да, Нет)");
            String searchWordScanner = scanner.nextLine();
            if (searchWordScanner.equals("Да")) {
                do {
                    System.out.println("Введите название книги");
                    fileName = scanner.nextLine();
                } while (search.searchFileName(folderName, fileName));
            } else if (searchWordScanner.equals("Нет")) {
                proceedSearchFile = false;
            }
        }
        System.out.println(readBook(folderNameResult));
    }



    private static String readBook(String folderNameResult) {
        String book;
        try {
            book = Files.readString(Path.of(folderNameResult + "/" + "result.txt"));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return book;
    }
    public boolean searchFolder(String folderName) {
        boolean folder = true;
        while (folder) {
            File file = new File(folderName);
            if (!file.exists()) {
                System.out.println("Папка отсутствует, либо введен неправильный адрес");
                break;
            } else {
                folder = false;
                String[] str = file.list();
                for (String s : Objects.requireNonNull(str)) {
                    System.out.println(s);
                }
            }
        }
        return folder;
    }

    public boolean searchFileName(String folderName, String fileName) {
        boolean searchFileName = true;
        while (searchFileName) {
            File file = new File(folderName + "/" + fileName);
            if (file.exists()) {
                searchFileName = false;
            } else {
                System.out.println("Книга отсутствует в списке. Повторите попытку.");
                break;
            }
        }
        return searchFileName;
    }

    public void searchWord(String word, String folderName, String fileName, String folderNameResult) {
        ISearchEngine search = new EasySearch();
        String cont = String.valueOf(search.search(Collections.getString(folderName + "/" + fileName), word));
        System.out.println(cont);
        File file = new File(folderNameResult + "/" + "result.txt");
        if (file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.append(fileName).append(" - ").append(word).append(" - ").append(cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(fileName + " - " + word + " - " + cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
