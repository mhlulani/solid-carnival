package za.co.bmw.stacker;

import java.util.Arrays;

/**
 *
 * @author hlulani.mhlongo
 */
public class Stacker<E> {

    private Object[] data;
    private int size;
    public Stacker() {
        data = new Object[0];
        size = 0;
    }

    public E pop() {

        if (size == 0) {
            return null;
        }
        E e = (E) data[size - 1];
        data = Arrays.copyOf(data, --size);
        return e;
    }

    public void push(E item) {

        data = Arrays.copyOf(data, ++size);

        data[size - 1] = item;
    }

    public boolean empty() {
        return data == null || data.length == 0;
    }

    public int count() {
        return size;
    }
}
