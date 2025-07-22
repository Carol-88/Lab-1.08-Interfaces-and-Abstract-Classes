package org.example.intListInterface;

public class IntVector implements IntList{
    private int[] data;
    private int size;

    public IntVector() {
        data = new int[20];
        size = 0;
    }


    @Override
    public void add(int number) {
        if (size == data.length) {
            int newCapacity = data.length * 2; // double the size
            int[] newData = new int[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + id);
        }
        return data[id];
    }

    public int internalCapacity() {
        return data.length;
    }
}
