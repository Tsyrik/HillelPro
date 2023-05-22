package lesson008;

public class MyCollection {
    private String[] array;
    private int size;
    private int capacity;

    public MyCollection() {
        capacity = 5;
        array = new String[capacity];
        size = 0;

    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }

        if (size == capacity) {
            capacity += capacity*0.3;
            String[] newArray = new String[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
        return true;
    }

    public boolean add(String value) {
        return add(size, value);
    }


    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }


    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

}
