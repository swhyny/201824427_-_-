package edu.pnu.collection;
public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList() {
        data = new Object[DEFAULT_SIZE];
    }

    public GenericList(int a){
        data = new Object[a];
    }

    public void add(T newPlayer) {
        data[size] = newPlayer;
        size += 1;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i=0; i<size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public T get(int i) {
        return (T) data[i];
    }
}
