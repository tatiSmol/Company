interface Employee extends Comparable<Employee> {
    int getMonthSalary();
    @Override
    default int compareTo(Employee e) {
        return getMonthSalary() - e.getMonthSalary();
    }
}
