package main.java.com.company.allowances;

public class GrantsAllowanceStrategy implements AllowanceStrategy {
    private double grants;

    public GrantsAllowanceStrategy(double grants) {
        this.grants = grants;
    }

    @Override
    public double computeAllowance(double salary) {
        return grants;
    }
}
