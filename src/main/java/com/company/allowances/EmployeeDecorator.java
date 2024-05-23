package main.java.com.company.allowances;

import main.java.com.company.employees.Employee;

public abstract class EmployeeDecorator extends Employee {
    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee.getName(), decoratedEmployee.getSalary(),decoratedEmployee.getTotalLeaves());
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public void applyLeave(int days) {
        decoratedEmployee.applyLeave(days);
    }

    @Override
    public double getSalary() {
        return decoratedEmployee.getSalary();
    }
}
