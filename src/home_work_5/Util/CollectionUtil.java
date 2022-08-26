package home_work_5.Util;

import home_work_5.DTO.Animal;
import home_work_5.DTO.Person;
import home_work_5.Suppliers.SupplierAnimal;
import home_work_5.Suppliers.SupplierPerson;

import java.util.*;

public class CollectionUtil {

    private static final SupplierPerson supPerson = new SupplierPerson();

    private static final SupplierAnimal supAnimal = new SupplierAnimal();


    public static void collectionPerson(Collection<Person> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.add(supPerson.get());
        }
    }


    public static void collectionAnimal(Collection<Animal> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.add(supAnimal.get());
        }
    }


    public static <T> void testPerson(Collection<T> collection, Comparator<T> cmp) {
        long start1 = System.currentTimeMillis();
        sortStandardCollection(collection, cmp);
        long finish1 = System.currentTimeMillis();
        System.out.println("sortStandardCollectionPerson: " + (finish1 - start1));
        long start2 = System.currentTimeMillis();
        sortMyCollection(collection, cmp);
        long finish2 = System.currentTimeMillis();
        System.out.println("sortMyCollectionPerson:" + (finish2 - start2));

        long start3 = System.currentTimeMillis();
        iteratorCollection(collection);
        long finish3 = System.currentTimeMillis();
        System.out.println("iteratorCollection:" + (finish3 - start3));

        long start4 = System.currentTimeMillis();
        enumerationCollection(collection);
        long finish4 = System.currentTimeMillis();
        System.out.println("iteratorCollection:" + (finish4 - start4));

        long start5 = System.currentTimeMillis();
        collection.clear();
        long finish5 = System.currentTimeMillis();
        System.out.println("clear:" + (finish5 - start5));
    }


    public static <T> void sortStandardCollection(Collection<T> collection, Comparator<T> cmp) {
        ArrayList<T> arrayList = new ArrayList<>(collection);
        arrayList.sort(cmp);
    }


    public static <T> void sortMyCollection(Collection<T> collection, Comparator<T> cmp) {
        ArrayList<T> arrayList = new ArrayList<>(collection);
        for (int i = 0; i < collection.size() - 1; i++) {
            for (int j = collection.size() - 1; j > i; j--) {
                if (cmp.compare(arrayList.get(j - 1), arrayList.get(j)) > 0) {
                    T x = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j - 1));
                    arrayList.set((j - 1), x);
                }
            }
        }
    }


    public static <T> void iteratorCollection(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }


    public static <T> void enumerationCollection(Collection<T> collection) {
        ArrayList<T> arrayList = new ArrayList<>(collection);
        for (int i = 0; i < arrayList.size(); i++) {
            T x = arrayList.get(i);
        }
    }
}