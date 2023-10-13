import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Company {
    protected ArrayList<Employee> staffList;
    protected int income;

    public Company() {
        staffList = new ArrayList<>();
    }

    protected void hire(Employee employee) {
        staffList.add(employee);
    }

    protected void hireAll(Collection<Employee> employees) {
        staffList.addAll(employees);
    }

    protected void fire(Employee employee) {
        staffList.remove(employee);
    }

    protected double getIncome() {
        return income;
    }

    protected List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    protected List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }
}
