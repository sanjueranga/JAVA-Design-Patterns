package main.java.com.company.employees;

public abstract class Employee {
    protected String name;
    protected double salary;
    protected int totalLeaves;
    protected int leavesTaken;

    public Employee(String name, double salary, int totalLeaves) {
        this.name = name;
        this.salary = salary;
        this.totalLeaves = totalLeaves;
        this.leavesTaken = 0;
    }

    public void applyLeave(int days) {
        if (days <= (totalLeaves - leavesTaken)) {
            leavesTaken += days;
            System.out.println(name + " has taken " + days + " days leave. Total leaves taken: " + leavesTaken);
        } else {
            System.out.println(name + " cannot take " + days + " days leave. Not enough leave balance.");
        }
    }

    public int getRemainingLeaves() {
        return totalLeaves - leavesTaken;
    }

    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    public int getTotalLeaves(){
        return  totalLeaves;
    }
}
