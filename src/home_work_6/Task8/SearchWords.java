package home_work_6.Task8;

import home_work_6.Collections;
import home_work_6.SearchEngine.EasySearch;
import home_work_6.SearchEngine.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SearchWords {
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


    private String fileName;
    private String folderName;
    private String word;
    private String folderNameResult;


    public void WorkWithThread(String fileName, String folderName, String word, String folderNameResult) {
        this.fileName = fileName;
        this.folderName = folderName;
        this.word = word;
        this.folderNameResult = folderNameResult;
    }

    public void run() {
        ISearchEngine easySearch = new EasySearch();
        String cont = String.valueOf(easySearch.search(Collections.getString(this.folderName + "/" + this.fileName), this.word));
        System.out.println(this.fileName + " " + cont);
        File file = new File(this.folderNameResult + "/" + "result.txt");
        if (file.exists()) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.append(this.fileName).append(" - ").append(this.word).append(" - ").append(cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(this.fileName + " - " + this.word + " - " + cont);
                fileWriter.append(System.lineSeparator());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public List<String> searchFolder(String folderName) {
        boolean folder = true;
        List<String> list = null;
        while (folder) {
            File file = new File(folderName);
            if (!file.exists()) {
                System.out.println("Книга не найдена! ");
                break;
            } else {
                folder = false;
                String[] fileString = file.list();
                list = new ArrayList<>();
                for (String s : Objects.requireNonNull(fileString)) {
                    System.out.println(s);
                    list.add(s);
                }
            }
        }
        return list;
    }

    public void searchWord(List<String> list, String folderName, String word, String folderNameForSaveResult) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        for (String s : list) {
            executor.submit(new OllWordsInBooks(s, folderName, word, folderNameForSaveResult));
        }
        executor.shutdown();
        boolean done = false;
        try {
            while (!done) {
                done = executor.awaitTermination(1, TimeUnit.MINUTES);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
