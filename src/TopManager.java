public class TopManager implements Employee{
    protected final double SALARY = 170_000;
    protected double bonus;

    protected double salaryWithBonus() {
        bonus = (double) Math.round(SALARY * 1.5 * 100.0) / 100;
        return (double) Math.round((SALARY + bonus) * 100.0) / 100;
    }

    protected boolean isPlanFulfilled() {
        return Company.getIncome() > 10_000_000;
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
