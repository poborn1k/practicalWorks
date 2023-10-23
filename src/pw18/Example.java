package pw18;

import java.io.Serializable;

public class Example<T extends Comparable<T>, V extends Serializable, K extends Animal> {
    private final T field1;
    private final V field2;
    private final K field3;

    public Example(T field1, V field2, K field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public T getField1() {
        return field1;
    }

    public V getField2() {
        return field2;
    }

    public K getField3() {
        return field3;
    }

    public void printClassNames() {
        System.out.println("Class of T: " + field1.getClass().getSimpleName());
        System.out.println("Class of V: " + field2.getClass().getSimpleName());
        System.out.println("Class of K: " + field3.getClass().getSimpleName());
    }
}
