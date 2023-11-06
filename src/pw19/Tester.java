package pw19;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Number[] array1 = {32, 23, 452, 2, 4555};
        Number[] array2 = {32.3, 23.54, 452.213, 2.0, 4555.4};
        String[] array3 = {"fsad", "fdsa", "grew", "hryt"};

        ArrayList<Number> list1 = toList(array1);
        ArrayList<Number> list2 = toList(array2);
        ArrayList<String> list3 = toList(array3);

        System.out.println(list1.toString() + "\t" + list1.getClass());
        System.out.println(list2.toString() + "\t" + list2.getClass());
        System.out.println(list3.toString() + "\t" + list3.getClass());

        Array<Number> test = new Array<>(array1.length);
        test.setAll(array1);
        System.out.println(test.get(3));
    }

    public static <T> ArrayList<T> toList(T[] array) {
        ArrayList<T> list = new ArrayList<>();

        //list.addAll(Arrays.asList(array));

        for (T element : array) {
            list.add(element);
        }

        return list;
    }
}

