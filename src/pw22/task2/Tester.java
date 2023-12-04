package pw22.task2;

public class Tester {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Chair chair = factory.createVictorianChair(19);
        Client client = new Client();
        client.setChair(chair);

        client.sit();
    }
}
