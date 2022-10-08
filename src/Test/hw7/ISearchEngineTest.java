package Test.hw7;

import home_work_6.SearchEngine.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ISearchEngineTest {
    @Test
    public void easySearch1(){
        ISearchEngine test1 = new EasySearch();
        assertEquals(1,test1.search("Солнце солнце солНце", "солнце"));
    }

    @Test
    public void easySearch2(){
        ISearchEngine test2 = new EasySearch();
        assertEquals(2, test2.search("мороз Мороз морозко Мороз МОРОЗ мороз", "мороз"));
    }

    @Test
    public void regExSearch3(){
        ISearchEngine test3 = new RegExSearch();
        assertEquals(4, test3.search("МИР мир мир мир мир Мир МиР", "мир"));
    }

    @Test
    public void regExSearch2(){
        ISearchEngine test4 = new RegExSearch();
        assertEquals(0, test4.search("война войнА войНа ВОЙНА", "воЙна"));
    }

    @Test
    public void enginePunNormSearch1(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(2,count.search("цветок Цветок цветок ЦВеток", "цветок"));
    }

    @Test
    public void enginePunNormSearch2(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(1,count.search("АНИМЕЕЕ аниме АНИме анимее АНИМЕ", "аниме"));
    }

    @Test
    public void decoratorSearch1(){
        ISearchEngine count = new Decorator(new EasySearch());
        assertEquals(5,count.search("Котик котик КОТИК КоТиК КОТик", "котик"));
    }

    @Test
    public void decoratorSearch2(){
        ISearchEngine count = new Decorator(new EasySearch());
        assertEquals(5,count.search("ЧЕК Чек чек Чеки чеки чЕк чеК", "чек"));
    }
}
