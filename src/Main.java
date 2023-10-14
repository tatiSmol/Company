import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        IntStream.range(0, 180).mapToObj(i -> new Operator(company)).forEach(company::hire);
        IntStream.range(0, 80).mapToObj(i -> new Manager(company)).forEach(company::hire);
        IntStream.range(0, 10).mapToObj(i -> new TopManager(company)).forEach(company::hire);

        printInfo(company);
        fireHalfEmployees(company);
        printInfo(company);
    }

    public static void fireHalfEmployees(Company company) {
        int count = company.getStaffList().size();
        for (int i = 0; i < count / 2; i++) {
            company.fire(company.getStaffList().get(i + 1));
        }
    }

    public static void printInfo(Company company) {
        System.out.println("Количество персонала: " + company.getStaffList().size());
        System.out.println("Заработано: " + company.getIncome());

        System.out.println("------------");
        System.out.println("Самые высокие зарплаты:");
        company.getTopSalaryStaff(15).forEach(System.out::println);
        System.out.println("------------");
        System.out.println("Самые низкие зарплаты:");
        company.getLowestSalaryStaff(10).forEach(System.out::println);
        System.out.println("------------");
    }


}