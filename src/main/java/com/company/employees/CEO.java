package main.java.com.company.employees;

import main.java.com.company.allowances.AllowanceStrategy;

public class CEO extends ExecutiveStaff {
    private static CEO instance;

    private CEO(String name, double salary, int totalLeaves ,AllowanceStrategy strategy) {
        super(name, salary,totalLeaves);
        if (strategy != null) {
            this.salary += strategy.computeAllowance(salary);
        }
    }

    public static CEO getInstance(String name, double salary,int totalLeaves ,AllowanceStrategy strategy) {
        if (instance == null) {
            instance = new CEO(name, salary,totalLeaves ,strategy );
        }
        return instance;
    }
}
