package home_work_1.your_name;

public class NameIf implements ICommunicationPrinter {
    @Override
    public String welcome(String name){
        String name1 = "Вася";
        String name2 = "Анастасия";

        if (name.equals(name1)) {
            return "Привет!\nЯ тебя так долго ждал";
        }
        if (name.equals(name2)) {
            return "Я тебя так долго ждал";
        }
            return "Добрый день, а вы кто?";
    }
}