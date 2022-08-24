package home_work_5.Suppliers;

import home_work_5.DTO.Person;
import home_work_5.Util.NicknameUtil;
import home_work_5.Util.PersonUtil;

import java.util.function.Supplier;

public class SupplierPerson implements Supplier<Person> {

    @Override
    public Person get() {
        return new Person(NicknameUtil.randomNick(), PersonUtil.checkPassword(PersonUtil.password()), PersonUtil.randomName());
    }
}