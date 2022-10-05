package home_work_6.Task8;

import home_work_6.Collections;
import home_work_6.SearchEngine.EasySearch;
import home_work_6.SearchEngine.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OllWordsInBooks implements Runnable {
    private final String fileName;
    private final String folderName;
    private final String word;
    private final String folderNameResult;


    public OllWordsInBooks(String fileName, String folderName, String word, String folderNameResult) {
        this.fileName = fileName;
        this.folderName = folderName;
        this.word = word;
        this.folderNameResult = folderNameResult;
    }

    @Override
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
}
