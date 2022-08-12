package home_work_4;

import java.util.*;

public class DataContainer<T> implements Iterable<T>{
    private T[] data;

    public DataContainer(T[] data){
        this.data = data;
    }


    public int add(T item) {
        for (int i = 0; i < data.length; ) {
            if (item == null) {
                return -1;
            } else if (data[i] == null) {
                data[i] = item;
                return i;
            } else if (i < data.length - 1) {
                i++;
            } else {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                return data.length - 1;
            }
        }
        return 0;
    }

    public T get(int index) {
        if (data.length <= index || index < 0) {
            return null;
        } else {
            return data[index];
        }
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index){
        for (int i = 0; i < data.length; ) {
            if (i == index && index < data.length - 1) {
                data[i] = data[i + 1];
                index++;
            } else if (i < data.length - 1) {
                i++;
            } else if (data[data.length - 1] == data[data.length - 2]) {
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean delete(T item){
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                delete(i);
                return true;
            }
        }
        return false;
    }


    public void sort(Comparator<T> comparator){
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare(data[i], data[j]) > 0) {
                    T tmp = data[j];
                    data[j] = data[i];
                    data[i] = tmp;
                }
            }
        }
    }



    public String toString() {
        StringBuilder str = new StringBuilder();
        for (T a : this.data) {
            if (a != null) {
                str.append(a).append(" ");
            }
        }
        str.delete(str.length(), str.length());
        return str.toString();
    }
    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        T[] data = container.getItems();
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[i] != null && data[j] != null) {
                    if (data[i].compareTo((data[j])) > 0) {
                        T a = data[j];
                        data[j] = data[i];
                        data[i] = a;
                    }
                }
            }
        }
    }

    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] data = container.getItems();
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[j] != null && data[j] != null) {
                    if (comparator.compare(data[i], data[j]) > 0) {
                        T a = data[j];
                        data[j] = data[i];
                        data[i] = a;
                    }
                }
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new DataIterator();
    }

    class DataIterator implements Iterator<T> {

        private int counter;

        @Override
        public boolean hasNext() {
            return counter < data.length;
        }

        @Override
        public T next() {
            return data[counter++];
        }
    }
}
