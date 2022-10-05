package home_work_1.your_name;

public class NameIfElseIf implements ICommunicationPrinter {
    @Override
    public String welcome(String name){
        String name1 = "Вася";
        String name2 = "Анастасия";

        if (name.equals(name1)) {
            return "Привет!\nЯ тебя так долго ждал";
        } else if (name.equals(name2)) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
