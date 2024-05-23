package main.java.com.company.allowances;


public class PercentageAllowanceStrategy implements AllowanceStrategy {
    private double percentage;

    public PercentageAllowanceStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double computeAllowance(double salary) {
        return salary * percentage;
    }
}
