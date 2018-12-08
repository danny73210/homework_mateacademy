package arrayList;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyOwnArrayList<T> implements List<T> {

    private T[] elementData;
    private int size;

    public MyOwnArrayList() {
        this(10);
    }

    public MyOwnArrayList(int initialCapacity) {
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

    @Override
    public void add(int index, T element) {
        validateCapacity(size + 1);
        elementData[index] = element;
        size++;
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
    public void replaceAll(UnaryOperator<T> operator) {

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
