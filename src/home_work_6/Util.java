package home_work_6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Util {
    public static String converting(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(text);
        if (file.exists() && !file.isDirectory()) {
            try (FileReader fileReader = new FileReader(text)) {
                int temp;
                while ((temp = fileReader.read()) != -1) {
                    stringBuilder.append(Character.toChars(temp));
                }
                return stringBuilder.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return text;
        }
    }
}
