package main.java.com.company.proxy;

import main.java.com.company.departments.Department;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    public String viewCompanyInformation() {
        StringBuilder info = new StringBuilder("Company: " + name + "\nDepartments:\n");
        for (Department department : departments) {
            info.append(department.getName()).append("\n");
        }
        return info.toString();
    }
}
