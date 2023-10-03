package pw15.task3;

import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Client model = retrieveClientFromDatabase();
        ClientView view = new ClientView();
        ClientController controller = new ClientController(model, view);
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu
                    1 - Show client information
                    2 - Change client payment
                    3 - Change payment status
                    4 - Get client name
                    5 - Get client payment
                    6 - Get client date of join
                    7 - Get client payment status
                    0 - Exit""");

            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> controller.updateView();
                case 2 -> {
                    System.out.print("Enter new payment: ");
                    controller.setClientPayment(scan.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter new status of payment (true/false): ");
                    controller.setClientPaid(scan.nextBoolean());
                }
                case 4 -> System.out.println("Client name: " + controller.getClientName());
                case 5 -> System.out.println("Client payment: " + controller.getClientPayment());
                case 6 -> System.out.println("Client date of join: " + controller.getClientDateOfJoin());
                case 7 -> System.out.println("Client payment status: " + controller.clientsPaid());
                case 0 -> {
                    System.out.println("Program is closed");
                    return;
                }
            }
            System.out.println();
        }
    }

    public static Client retrieveClientFromDatabase() {
        Client client = new Client();
        client.setName("John");
        client.setDateOfJoin("29.03.12");
        client.setPayment(1999);
        client.setPaid(true);
        return client;
    }
}
