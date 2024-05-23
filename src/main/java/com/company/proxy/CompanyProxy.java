package main.java.com.company.proxy;


public class CompanyProxy {
    private Company company;

    public CompanyProxy(Company company) {
        this.company = company;
    }

    public String viewCompanyInformation() {
        return company.viewCompanyInformation();
    }

    public String executeOperation(String operation) {
        return "Guests are not allowed to execute operations.";
    }
}
