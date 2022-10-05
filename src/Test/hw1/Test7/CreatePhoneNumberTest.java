package Test.hw1.Test7;

import home_work_1.TaskCreatePhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CreatePhoneNumberTest {
    @Test
    public void createPhoneNumber() {
        TaskCreatePhoneNumber createPhoneNumber = new TaskCreatePhoneNumber();
        Assertions.assertEquals("(123) 456-7890", createPhoneNumber.createPhoneNumber(new int[]{1234567890}));
    }
}
