package homeworks.homework_41_streamWithCollections.employee;

public class Employee {

    /*
    Дан список объектов сотрудников (Employee), где каждый объект содержит имя и отдел,
    в котором работает сотрудник. Необходимо сгруппировать сотрудников по отделам
    и подсчитать количество сотрудников в каждом отделе.
     */

    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
