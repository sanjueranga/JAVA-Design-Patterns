package main.java.com.company.allowances;


import main.java.com.company.employees.Employee;

public class AllowanceDecorator extends EmployeeDecorator {
    private AllowanceStrategy allowanceStrategy;

    public AllowanceDecorator(Employee decoratedEmployee, AllowanceStrategy allowanceStrategy) {
        super(decoratedEmployee);
        this.allowanceStrategy = allowanceStrategy;
    }

    public double getAllowance() {
        return allowanceStrategy.computeAllowance(decoratedEmployee.getSalary());
    }

    @Override
    public double getSalary() {
        return decoratedEmployee.getSalary() + getAllowance();
    }
}
