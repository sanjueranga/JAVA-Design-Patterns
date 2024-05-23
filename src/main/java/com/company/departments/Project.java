package main.java.com.company.departments;

public class Project implements OrganizationComponent {
    private final String name;
    private final double budget;
    private final int duration;
    private final String location;
    private final int noOfEmpoyees;

    public Project(String name, double budget, int duration,int noOfEmployees, String location) {
        this.name = name;
        this.budget = budget;
        this.duration = duration;
        this.location = location;
        this.noOfEmpoyees = noOfEmployees;
    }

    public void showDetails() {
        System.out.println("Project: " + name + ", Budget: " + budget + ", Duration: " + duration + ", No Of Employees" + noOfEmpoyees + ", Location: " + location);
    }


}
