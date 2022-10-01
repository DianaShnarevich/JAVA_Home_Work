package home_work_6.SearchEngine;

import home_work_6.SearchEngine.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.replaceAll("\\p{IsPunctuation}", "");
        return searchEngine.search(text, word);
    }
}
