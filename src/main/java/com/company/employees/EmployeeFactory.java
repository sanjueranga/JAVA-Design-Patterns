package main.java.com.company.employees;

import main.java.com.company.allowances.AllowanceDecorator;
import main.java.com.company.allowances.AllowanceStrategy;

public class EmployeeFactory {
    public static Employee createEmployee(String type, String name, double salary,int totalLeaves , AllowanceStrategy allowanceStrategy) {
        Employee employee;

        switch (type) {
            case "ExecutiveStaff":
                employee = new ExecutiveStaff(name, salary,totalLeaves);
                if (allowanceStrategy != null) {
                    employee = new AllowanceDecorator(employee, allowanceStrategy);
                }
                break;
            case "ManagementAssistant":
                employee = new ManagementAssistant(name, salary,totalLeaves);
                break;
            case "WorkAid":
                employee = new WorkAid(name, salary,totalLeaves);
                break;
            default:
                throw new IllegalArgumentException("Invalid employee type");
        }

        return employee;
    }
}
