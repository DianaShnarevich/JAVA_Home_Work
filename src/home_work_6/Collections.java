package home_work_6;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        System.out.println("Количество слов: " + setCollect());
        System.out.println();
    }

    public static int setCollect() {
        Set<String> words = new LinkedHashSet<>();
        StringBuilder str = new StringBuilder();

        try (FileReader file = new FileReader("HomeWork/src/home_work_6/WarAndPeace.txt")) {
            int tmp;
            while ((tmp = file.read()) != -1) {
                if ((tmp == 45 && str.length() > 0) || (tmp >= 1040 && tmp <= 1103) || (tmp >= 48 && tmp <= 57)) {
                    str.append(Character.toString(tmp));
                } else if (str.length() > 0) {
                    words.add(str.toString());
                    str.delete(0, str.length());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(words); //вывод всех слов
        return words.size();
    }


    private static final List<Map.Entry<String, Integer>> arrayList = new ArrayList<>();

    private static void counts(){
        StringBuilder str = new StringBuilder();
        Comparator compare = new Comparator();
        Map<String, Integer> map = new HashMap<>();

        try (FileReader file = new FileReader("HomeWork/src/home_work_6/WarAndPeace.txt")) {
            int temp;
            while ((temp = file.read()) != -1) {
                String word = "";
                if ((temp == 45 && str.length() > 0) || (temp >= 1040 && temp <= 1103) || (temp >= 48 && temp <= 57)) {
                    str.append(Character.toString(temp));
                } else {
                    word = str.toString();
                    str.delete(0, str.length());
                }
                if (word.length() > 0) {
                    if (map.containsKey(word)) {
                        int counter = map.get(word) + 1;
                        map.put(word, counter);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Map.Entry<String, Integer>> arrayList = new ArrayList<>(map.entrySet());
        arrayList.sort(compare);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.add(arrayList.get(i));
        }
    }
    public static void topN(List<Map.Entry<String, Integer>> arrList, int number) {
        int i = 0;
        while (i < number) {
            System.out.println(arrList.get(i));
            i++;
        }
    }
}
