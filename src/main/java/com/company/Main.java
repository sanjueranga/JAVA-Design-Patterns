package main.java.com.company;

import main.java.com.company.allowances.*;
import main.java.com.company.departments.*;
import main.java.com.company.employees.*;
import main.java.com.company.proxy.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(("System has started Successfully"));

        // Define allowance strategies
        AllowanceStrategy percentageStrategy = new PercentageAllowanceStrategy(0.1);
        AllowanceStrategy performanceStrategy = new PerformanceAllowanceStrategy(1.2);
        AllowanceStrategy grantsStrategy = new GrantsAllowanceStrategy(5000);

        // Create CEO using singleton pattern
        CEO ceo = CEO.getInstance("Elon Musk", 10000,5 ,percentageStrategy);

        // Create other employees using factory
        Employee executive = EmployeeFactory.createEmployee("ExecutiveStaff", "Steve Smith", 8000,4, performanceStrategy);
        Employee executiveGrant = EmployeeFactory.createEmployee("ExecutiveStaff", "Lewis Hamilton", 5000,4, grantsStrategy);
        Employee assistant = EmployeeFactory.createEmployee("ManagementAssistant", "Max Verstappen", 3000, 3,null);
        Employee workAid = EmployeeFactory.createEmployee("WorkAid", "Chris Brown", 2000, 2,null);

        // Print employee details
        printEmployeeDetails(ceo, executive,executiveGrant ,assistant, workAid);

        // Create departments and projects
        Department marketing = new Department("Marketing");
        Project projectA = new Project("Project A", 50000, 6, 10, "New York");
        marketing.addComponent(projectA);

        Department hr = new Department("HR");
        Project projectB = new Project("Project B", 20000, 3, 5, "Chicago");
        hr.addComponent(projectB);
        System.out.println("---------------------------------------------------------------------");


        // Create company and add departments
        Company company = new Company("Tech Solutions");
        company.addDepartment(marketing);
        company.addDepartment(hr);

        //show department details
        marketing.showDetails();
        hr.showDetails();

        System.out.println("---------------------------------------------------------------------");


        // Proxy for guest access
        CompanyProxy guestProxy = createGuestProxy(company);
        System.out.println(guestProxy.viewCompanyInformation()); // Allowed
        System.out.println(guestProxy.executeOperation("SomeOperation")); // Denied

        // Demonstrate decorated employees
        System.out.println("CEO Salary with Allowance: " + ceo.getSalary());
        System.out.println("Executive Salary with Allowance: " + executive.getSalary());
    }

    private static void printEmployeeDetails(Employee... employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getClass().getSimpleName() + ": " + employee.getName() + ", Salary: " + employee.getSalary() + ", Leaves Allowed :"+ employee.getTotalLeaves());
        }
    }

    private static CompanyProxy createGuestProxy(Company company) {
        return new CompanyProxy(company);
    }
}
