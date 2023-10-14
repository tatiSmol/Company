import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Company {
    protected ArrayList<Employee> staffList;
    protected double income;

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
        for (Employee employee : staffList) {
            if (employee instanceof Manager) {
                income += ((Manager) employee).getEarnedMoney();
            }
        }
        return income;
    }

    protected boolean isQuantityCorrect(int count) {
        return count > 0 && count <= staffList.size();
    }

    protected List<Employee> getTopSalaryStaff(int count) {
        if (isQuantityCorrect(count)) {
            staffList.sort(Comparator.reverseOrder());
        }
        return staffList.subList(0, count);
    }

    protected List<Employee> getLowestSalaryStaff(int count) {
        if (isQuantityCorrect(count)) {
            staffList.sort(Comparator.naturalOrder());
        }
        return staffList.subList(0, count);
    }
}
