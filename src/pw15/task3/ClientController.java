package pw15.task3;

public class ClientController {
    private final Client model;
    private final ClientView view;

    ClientController(Client model, ClientView view) {
        this.model = model;
        this.view = view;
    }

    public String getClientName() {
        return model.getName();
    }

    public int getClientPayment() {
        return model.getPayment();
    }

    public void setClientPayment(int payment) {
        model.setPayment(payment);
    }

    public String getClientDateOfJoin() {
        return model.getDateOfJoin();
    }

    public boolean clientsPaid() {
        return model.isPaid();
    }

    public void setClientPaid(boolean paid) {
        model.setPaid(paid);
    }

    public void updateView() {
        view.printClientDetails(getClientName(), getClientDateOfJoin(), getClientPayment(), clientsPaid());
    }
}
