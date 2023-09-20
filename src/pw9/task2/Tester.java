package pw9.task2;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car("BMW", 3199999, 'S');

        System.out.println(car.toString());

        System.out.println("PRICE: " + car.getPrice());
    }
}
