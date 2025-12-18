package org.vova.dmdev.level2.block6.exercise3;

import java.util.Iterator;

public class ListExercise<T> implements Iterable<T> {
    private T[] objects;
    private int size;

    public ListExercise(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T object) {
        objects[size++] = object;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
