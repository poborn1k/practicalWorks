package pw15.task3;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Client model = retrieveClientFromDatabase();
        ClientView view = new ClientView();
        ClientController controller = new ClientController(model, view);
        controller.updateView();
        controller.setClientPayment(2499);
        controller.setClientPaid(false);
        System.out.println("After updating, Employee Information are as follows");
        controller.updateView();
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
