package pw6.task1;

public class Tester {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", "White", 10.99, 25.5);
        plate.use();
        plate.clean();
        plate.displayInfo();

        System.out.println();

        Cup cup = new Cup("Glass", "Transparent", 5.99, 300);
        cup.use();
        cup.clean();
        cup.displayInfo();
    }
}
