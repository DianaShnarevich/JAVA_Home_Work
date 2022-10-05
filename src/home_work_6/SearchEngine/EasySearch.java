package home_work_6.SearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        int indexSearch = 0;
        int indexOf = text.indexOf(word, indexSearch);

        while (indexOf != -1) {
            if (afterChar(text, indexOf, word.length()) && beforeChar(text, indexOf)) {
                count++;
            }
            indexSearch = indexOf + word.length();
            indexOf = text.indexOf(word, indexSearch);
        }
        return count;
    }

    private boolean afterChar(String text, int indexOf, int length) {
        if (text.length() == indexOf + length) {
            return true;
        }
        char after = text.charAt(indexOf + length);
        return !(after >= 1040 && after <= 1103) && !(after >= 48 && after <= 57) && after != 45;
    }

    private boolean beforeChar(String text, int indexOf) {
        if (indexOf == 0) {
            return true;
        }
        char before = text.charAt(indexOf - 1);
        return !(before >= 1040 && before <= 1103) && !(before >= 48 && before <= 57) && before != 45;
    }
}
