package Patterns.MVC;

public class MVCPattern {

  public void runMVCPattern() {
    Employee employee = retrieveEmployeeFromServer();

    EmployeeDashboardView view = new EmployeeDashboardView();

    EmployeeController controller = new EmployeeController(employee, view);



//        controller.setEmployee(employee.getFirstName(), employee.getLastName());

    controller.updateDashboardView();

  }

  public static Employee retrieveEmployeeFromServer() {
    Employee employee = new Employee();
    employee.setSsNumber("32765523");
    employee.setFirstName("James");
    employee.setLastName("Bond");
    employee.setSalary(125000);

    return employee;

  }

}
