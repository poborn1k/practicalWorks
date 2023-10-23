package pw14;

import java.util.ArrayList;
import java.util.Collection;

public class Tester {
    public static void main(String[] args) {
        Collection<Integer> test = new ArrayList<>();
        test.add(11);
        test.add(22);
        test.add(33);
        test.add(44);

        WaitList<Integer> test2 = new WaitList<>(test);
        test2.add(55);
        System.out.println(test2.toString());
        test2.remove();
        System.out.println(test2.toString());
        System.out.println(test2.contains(33));
        System.out.println(test2.containsAll(test));
        System.out.println(test2.isEmpty());


        BoundedWaitList<Character> test3 = new BoundedWaitList<>(10);

        for (int i = 0; i < test3.getCapacity() + 2; i++) {
            test3.add('a');
        }

        System.out.println(test3.toString());


        UnfairWaitList<String> test4 = new UnfairWaitList<>();

        for (int i = 0; i < 10; i++) {
            test4.add(String.format("a - %d", i));
        }

        System.out.println(test4.toString());
        test4.remove("a - 9");
        test4.moveToBack("a - 5");
        System.out.println(test4.toString());

    }
}
