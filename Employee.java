// src/model/Employee.java
package model;

public class Employee {
    private String name;
    private String role;
    private int employeeId;
    private boolean isActive;

    public Employee(String name, String role, int employeeId, boolean isActive) {
        this.name = name;
        this.role = role;
        this.employeeId = employeeId;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Employee [ID: " + employeeId + ", Name: " + name + ", Role: " + role + ", Active: " + (isActive ? "Yes" : "No") + "]";
    }
}
