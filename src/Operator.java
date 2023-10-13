public class Operator implements Employee {
    protected final double SALARY = 100_000;

    @Override
    public double getMonthSalary() {
        return SALARY;
    }

    @Override
    public String toString() {
        return getClass().getName() + ", зарплата: " + getMonthSalary() + ".руб;";
    }
}
