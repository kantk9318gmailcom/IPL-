// src/controller/EmployeeController.java
package controller;

import model.Employee;
import view.EmployeeView;
import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    private EmployeeView view;
    private List<Employee> employees;

    public EmployeeController(EmployeeView view) {
        this.view = view;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role, int employeeId, boolean isActive) {
        Employee employee = new Employee(name, role, employeeId, isActive);
        employees.add(employee);
    }

    public void displayEmployees() {
        view.displayEmployees(employees);
    }

    public void markEmployeeAsInactive(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setActive(false);
                System.out.println("Employee with ID " + employeeId + " has been marked as inactive.");
                break;
            }
        }
    }
}
