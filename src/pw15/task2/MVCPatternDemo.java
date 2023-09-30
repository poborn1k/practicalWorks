package pw15.task2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Adolf");
        controller.setEmployeeSalary(999999);
        System.out.println("After updating, Employee Information are as follows");
        controller.updateView();
    }

    public static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setSalary(500);
        return employee;
    }
}
