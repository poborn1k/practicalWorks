package pw15.task3;

public class ClientView {
    public void printClientDetails(String name, String dateOfJoin, int payment, boolean isPaid) {
        System.out.printf("Client information\nName: %s\nDate of join: %s\nPayment: %d\nPaid this month: %b\n",
                name, dateOfJoin, payment, isPaid);
    }
}
