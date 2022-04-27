package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += (percentage * grossSalary) / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name: '" + name + '\'' +
                ", Gross Salary: " + grossSalary +
                ", Tax: " + tax +
                ", Net Salary: R$ " + String.format("%.2f", netSalary()) +
                " }";
    }
}
