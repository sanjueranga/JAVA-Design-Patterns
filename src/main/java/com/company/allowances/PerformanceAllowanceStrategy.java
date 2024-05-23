package main.java.com.company.allowances;

public class PerformanceAllowanceStrategy implements AllowanceStrategy {
    private double performanceRating;

    public PerformanceAllowanceStrategy(double performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public double computeAllowance(double salary) {
        return salary * performanceRating;
    }
}
