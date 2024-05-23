package main.java.com.company.departments;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private final List<OrganizationComponent> components = new ArrayList<>();
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void addComponent(OrganizationComponent component) {
        components.add(component);
    }

    public void removeComponent(OrganizationComponent component) {
        components.remove(component);
    }

    public void showDetails() {
        System.out.println("Department: " + name);
        for (OrganizationComponent component : components) {
            component.showDetails();
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
