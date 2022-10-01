package home_work_6.SearchEngine;

import home_work_6.SearchEngine.ISearchEngine;
import home_work_6.SearchEngine.RegExSearch;

public class Decorator implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public Decorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            return searchEngine.search(text, word);
        } else {
            return searchEngine.search(text.toLowerCase(), word.toLowerCase());
        }
    }
}
