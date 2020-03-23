package Staff.Management;
import Staff.Employee;


public class Director extends Manager{
    private double budget;
    public Director(String name, String nationalInsurance, double salary, String deptName) {
        super(name, nationalInsurance, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double giveBonus() {
        return getSalary() * 0.02;
    }
}
