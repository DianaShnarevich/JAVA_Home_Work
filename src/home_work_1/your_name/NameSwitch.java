package home_work_1.your_name;

public class NameSwitch implements ICommunicationPrinter {
    @Override
    public String welcome(String name){

        switch (name) {
            case "Вася":
                return "Привет!\nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
