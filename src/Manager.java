public class Manager implements Employee{
    protected Company company;
    protected double salary;
    protected double earnedMoney;

    public Manager(Company company) {
        this.company = company;
        this.salary = (double) Math.round((Math.random() * (150_000 - 120_000) + 120_000) * 100.0) / 100;
        this.earnedMoney = (double) Math.round((Math.random() * (140_000 - 115_000) + 115_000) * 100.0) / 100;
    }

    @Override
    public double getMonthSalary() {
        return (double) Math.round((salary + earnedMoney * 0.05) * 100.0) / 100;
    }

    public double getEarnedMoney() {
        return earnedMoney;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": зарплата: " + getMonthSalary() + " руб;";
    }
}
