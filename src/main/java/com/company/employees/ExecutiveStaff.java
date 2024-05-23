package main.java.com.company.employees;

import main.java.com.company.allowances.AllowanceStrategy;

class ExecutiveStaff extends Employee {

    public ExecutiveStaff(String name, double salary,int totalLeaves) {
        super(name, salary,totalLeaves);
    }

    @Override
    public void applyLeave(int days) {
        System.out.println("Leave is applied");
    }
}