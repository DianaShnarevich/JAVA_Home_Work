package Test.hw1.Task4;

import home_work_1.branching_operators.LetterOrSymbol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterOrSymbolTest {
    @Test
    public void getSolution() {
        LetterOrSymbol letterOrSymbol = new LetterOrSymbol('a');
        Assertions.assertEquals("Letter: ", letterOrSymbol.getSolution());

        LetterOrSymbol letterOrSymbol1 = new LetterOrSymbol('&');
        Assertions.assertEquals("Symbol: ", letterOrSymbol1.getSolution());
    }
}
