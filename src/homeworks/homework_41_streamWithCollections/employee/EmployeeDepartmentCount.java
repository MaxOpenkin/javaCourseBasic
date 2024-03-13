package homeworks.homework_41_streamWithCollections.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDepartmentCount {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John Wick", "HR"),
                new Employee("Bruce Willis", "IT"),
                new Employee("Jim Beam", "HR"),
                new Employee("Jack Daniels", "IT"),
                new Employee("Jan Clod Van Dam", "Marketing")
        );

        Map<String, Long> departmentCounts = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(departmentCounts);
    }
}
