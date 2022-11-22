public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 100_000);
        employees[1] = new Employee("Parenkov Paren Ivanovich", 5, 120_000);
        employees[2] = new Employee("Lisenko Elena Pavlovna", 2, 140_000);
        printArray();
        System.out.println("Сумма зарплат работников: " + sumSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата сотрудников : " + averageSalary());
        printFullName();
    }

    public static void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static double sumSalary() {
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static double averageSalary() {
        int counterOfNotElements = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counterOfNotElements++;
            }
        }
        return sumSalary() / counterOfNotElements;
    }

    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}