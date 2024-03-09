package homeworks.homework_36.collections.departmentSalary;

public class Employee {

    // Создать класс Employee со свойствами name, department и salary, затем создать отображение TreeMap,
    // где ключом является отдел, а значением - список сотрудников, работающих в этом отделе.
    // Затем добавить несколько сотрудников в каждый отдел и вывести на консоль среднюю зарплату для каждого отдела.

    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }

}
