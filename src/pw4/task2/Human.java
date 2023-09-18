package pw4.task2;

import java.util.ArrayList;

public class Human {
    ArrayList<Object> humanBody = new ArrayList<>();

    public Human() {
        humanBody.add(new Head(true));
        humanBody.add(new Leg('l', true));
        humanBody.add(new Leg('r', true));
        humanBody.add(new Hand('l', true));
        humanBody.add(new Hand('r', true));
    }
    public void checkHuman() {
        for (Object tmp : humanBody) {
            System.out.println(tmp.toString());
        }
        Head tmp = (Head)humanBody.get(0);
        if (tmp.isAlive()) {
            System.out.println("Human is alive");
        } else {
            System.out.println("Human is dead (optionally)");
        }
    }
}
