public class Operator implements Employee {
    protected Company company;
    protected double salary;

    public Operator(Company company) {
        this.company = company;
        this.salary = (double) Math.round((Math.random() * (100_000 - 80_000) + 80_000) * 100.0) / 100;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": зарплата: " + getMonthSalary() + " руб;";
    }
}
