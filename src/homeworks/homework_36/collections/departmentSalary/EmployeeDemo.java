package homeworks.homework_36.collections.departmentSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeDemo {
    public static void main(String[] args) {

        Map<String, List<Employee>> departmentMap = new TreeMap<>();

        addEmployee(departmentMap, new Employee("John Doe", "IT", 3000));
        addEmployee(departmentMap, new Employee("Jane Doe", "IT", 3500));
        addEmployee(departmentMap, new Employee("Jim Beam", "HR", 2500));
        addEmployee(departmentMap, new Employee("Jill Valentine", "HR", 2900));


        // Вывод средней зарплаты по отделам
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            double totalSalary = 0;
            for (Employee employee : entry.getValue()) {
                totalSalary += employee.getSalary();
            }
            double averageSalary = totalSalary / entry.getValue().size();
            System.out.println(entry.getKey() + " средняя зарплата: " + averageSalary);
        }

    }

    private static void addEmployee(Map<String, List<Employee>> departmentMap, Employee employee) {
        List<Employee> employees = departmentMap.get(employee.getDepartment());
        if (employees == null) {
            employees = new ArrayList<>();
            departmentMap.put(employee.getDepartment(), employees);
        }
        employees.add(employee);
    }

}
