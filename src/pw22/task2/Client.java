package pw22.task2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Client is sitting on " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
