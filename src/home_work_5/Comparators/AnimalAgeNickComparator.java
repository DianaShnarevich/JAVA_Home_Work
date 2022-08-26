package home_work_5.Comparators;

import home_work_5.DTO.Animal;

import java.util.Comparator;

public class AnimalAgeNickComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        int result = Integer.compare(animal1.getAge(), animal2.getAge());
        if (result == 0) {
            return animal1.getNick().compareTo(animal2.getNick());
        }
        return result;
    }
}