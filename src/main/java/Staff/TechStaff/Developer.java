package Staff.TechStaff;
import Staff.Employee;

public class Developer extends Employee{

    public Developer(String name, String nationalInsurance, double salary){
        super(name, nationalInsurance, salary);
    }

    public double giveBonus() {
        return getSalary() * 0.01;
    }
}
