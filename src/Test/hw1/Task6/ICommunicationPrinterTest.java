package Test.hw1.Task6;
import home_work_1.your_name.NameIf;
import home_work_1.your_name.NameIfElseIf;
import home_work_1.your_name.NameSwitch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ICommunicationPrinterTest {
    @Test
    public void welcomeConditionOne() {
        NameIf cond1 = new NameIf();
        Assertions.assertEquals("Привет!" + " " + "Я тебя так долго ждал", cond1.welcome("Вася"));

        NameIf cond2 = new NameIf();
        Assertions.assertEquals("Я тебя так долго ждал", cond2.welcome("Анастасия"));

        NameIf cond3 = new NameIf();
        Assertions.assertEquals("Добрый день, а вы кто?", cond3.welcome("Павел"));
    }

    @Test
    public void welcomeConditionTwo() {
        NameIfElseIf cond1 = new NameIfElseIf();
        Assertions.assertEquals("Привет!" + " " + "Я тебя так долго ждал", cond1.welcome("Вася"));

        NameIfElseIf cond2 = new NameIfElseIf();
        Assertions.assertEquals("Я тебя так долго ждал", cond1.welcome("Анастасия"));

        NameIfElseIf cond3 = new NameIfElseIf();
        Assertions.assertEquals("Добрый день, а вы кто?", cond3.welcome("Павел"));
    }

    @Test
    public void welcomeConditionThree() {
        NameSwitch cond1 = new NameSwitch();
        Assertions.assertEquals("Привет!" + " " + "Я тебя так долго ждал", cond1.welcome("Вася"));

        NameSwitch cond2 = new NameSwitch();
        Assertions.assertEquals("Я тебя так долго ждал", cond2.welcome("Анастасия"));

        NameSwitch cond3 = new NameSwitch();
        Assertions.assertEquals("Добрый день, а вы кто?", cond3.welcome("Павел"));
    }
}
