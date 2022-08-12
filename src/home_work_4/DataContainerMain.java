package home_work_4;

import java.util.Arrays;
import java.util.Iterator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer<>(new Integer[5]);
        ComparatorInteger comparator = new ComparatorInteger();

        ComparatorInteger comparat = new ComparatorInteger();
        Iterator<Integer> iterator = container.iterator();

        container.add(1);
        container.add(2);
        container.add(3);
        container.add(15);


        System.out.println(container.add(13));
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.get(4));
        System.out.println(container.delete(0));
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(17));
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(2));
        System.out.println(Arrays.toString(container.getItems()));


        container.add(44);
        System.out.println(Arrays.toString(container.getItems()));
        container.delete(1);
        System.out.println(container.get(2));
        container.delete(2);
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(null));
        container.add(888);
        container.add(null);
        container.sort(comparator);
        System.out.println(Arrays.toString(container.getItems()));

        DataContainer.sort(container);
        System.out.println(Arrays.toString((container.getItems())));

        DataContainer.sort(container, comparat);
        System.out.println(Arrays.toString((container.getItems())));


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
