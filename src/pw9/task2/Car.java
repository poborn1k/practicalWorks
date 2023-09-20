package pw9.task2;

public class Car {
    private String mark;
    private int price;
    private char carClass;

    public Car(String mark, int price, char carClass) {
        this.mark = mark;
        this.price = price;
        this.carClass = carClass;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("Car information:\nMark: %s\nClass: %c\nPrice: %d",
                this.mark, this.carClass, this.price);
    }
}
