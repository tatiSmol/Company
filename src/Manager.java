public class Manager implements Employee{
    protected final double SALARY = 150_000;
    protected double earnedMoney;

    public Manager() {
        this.earnedMoney = (double) Math.round((Math.random() * (140_000 - 115_000) + 115_000) * 100.0) / 100;
    }

    @Override
    public double getMonthSalary() {
        return (double) Math.round((SALARY + earnedMoney * 0.05) * 100.0) / 100;
    }

    public double getEarnedMoney() {
        return earnedMoney;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": зарплата: " + getMonthSalary() +
                " руб, заработано для компании денег: " + earnedMoney + " руб;";
    }
}
