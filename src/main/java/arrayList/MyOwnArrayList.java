package arrayList;

import java.util.Arrays;

public class MyOwnArrayList<T> {

    private T[] elementData;
    private int size;

    public MyOwnArrayList() {
        this(10);
    }

    public MyOwnArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 0) {
            throw new NegativeArraySizeException("Illegal Capacity: " + initialCapacity);
        }

        T t[] = (T[]) new Object[initialCapacity];
        this.elementData = t;
    }

    public boolean add(T obj) {
        validateCapacity(size + 1);
        elementData[size++] = obj;
        return true;
    }

    public boolean add(T obj, int index) {
        validateCapacity(size + 1);
        elementData[index] = obj;
        size++;
        return true;
    }

    public T get(int index) {
        T obj = elementData[index];
        return obj;
    }

    public int size() {
        return size;
    }

    public void validateCapacity(int minCapacity){
        int oldCapacity = elementData.length;
        if (minCapacity > oldCapacity) {
            Object oldData[] = elementData;
            int newCapacity = (oldCapacity * 3)/2;

            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            T t[] = (T[])new Object[newCapacity];
            elementData = t;                  // src/srcPos/dest/destPos/length
            System.arraycopy(oldData, 0, elementData,0, size);
        }
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        elementData[index] = null;
        --size;
        return elementData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
