package Staff;

public abstract class Employee {

    private String name;
    private String nationalInsurance;
    private double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNationalInsurance() {
        return this.nationalInsurance;
    }

    public double getSalary() {
        return this.salary;
    }


    public double raiseSalary(Double increase){
        return this.salary + increase;
    }

    public abstract double giveBonus();
}
