package home_work_6.Task8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Search {
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
