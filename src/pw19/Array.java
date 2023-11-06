package pw19;

public class Array<T> {
    private T[] array;

    public Array(int size) {
        array = (T[]) new Object[size];
    }

    public void setAll(T[] arr) {
        if (arr.length > array.length) {
            System.err.println("Different size of array");
        } else {
            for (int i = 0; i < arr.length; i++) {
                set(i, arr[i]);
            }
        }
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }
}
