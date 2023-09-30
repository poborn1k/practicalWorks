package pw15.task2;

public class EmployeeController {
    private final Employee model;
    private final EmployeeView view;

    EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public int getEmployeeSalary() {
        return model.getSalary();
    }

    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }

    public void updateView() {
        view.printEmployeeDetails(getEmployeeName(), getEmployeeSalary());
    }
}
