package home_work_5.Comparators;

import home_work_5.DTO.Person;

import java.util.Comparator;

public class PasswordNickComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int result = Integer.compare(person1.getPassword().length(), person2.getPassword().length());
        if (result == 0) {
            return person1.getNick().compareTo(person2.getNick());
        }
        return result;
    }
}