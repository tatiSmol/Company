interface Employee extends Comparable<Employee> {
    double getMonthSalary();

    @Override
    default int compareTo(Employee e) {
        return (int) (getMonthSalary() - e.getMonthSalary());
    }
}
