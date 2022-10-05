package Test.hw1.Task4;
import home_work_1.branching_operators.ByteTranslation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ByteTranslationTest {
    @Test
    public void getByteTranslation() {
        ByteTranslation byteTranslation = new ByteTranslation(5000);
        Assertions.assertEquals(48.828125, byteTranslation.getByteTranslation());
    }
}
