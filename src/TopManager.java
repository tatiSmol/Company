public class TopManager implements Employee{
    protected Company company;
    protected double salary;
    protected double bonus;

    public TopManager(Company company) {
        this.company = company;
        this.salary = (double) Math.round((Math.random() * (200_000 - 170_000) + 170_000) * 100.0) / 100;
    }

    protected double salaryWithBonus() {
        bonus = (double) Math.round((salary * 1.5) * 100.0) / 100;
        return (double) Math.round((salary + bonus) * 100.0) / 100;
    }

    protected boolean isPlanFulfilled() {
        return company.income > 10_000_000;
    }

    @Override
    public double getMonthSalary() {
        return isPlanFulfilled() ? salaryWithBonus() : salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": зарплата: " + getMonthSalary() + " руб;";
    }
}
