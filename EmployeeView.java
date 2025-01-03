// src/view/EmployeeView.java
package view;

import model.Employee;
import java.util.List;

public class EmployeeView {
    public void displayEmployees(List<Employee> employees) {
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
