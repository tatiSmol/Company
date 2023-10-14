public class TopManager implements Employee{
    protected final double SALARY = 170_000;
    protected double bonus;

    protected double salaryWithBonus() {
        bonus = SALARY * 1.5;
        return SALARY + bonus;
    }

    protected boolean isPlanFulfilled() {
        return Company.income > 10_000_000;
    }

    @Override
    public double getMonthSalary() {
        return isPlanFulfilled() ? salaryWithBonus() : SALARY;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": зарплата: " + getMonthSalary() +
                " руб, бонус: " + bonus;
    }
}
