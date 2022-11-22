public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;

    private static int counter;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        counter++;
        id = counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getIndexedSalary() {
        double index = 1.1;
        return (int) (salary * index);
    }

    @Override
    public String toString() {
//        return id + ". " +
//                fullName +
//                "; номер отдела- " + department +
//                "; зарплата- " + salary;
        return String.format("%d. %s; Номер отдела: %d; Зарплата: %.2f", id, fullName, department, salary);
    }
}
