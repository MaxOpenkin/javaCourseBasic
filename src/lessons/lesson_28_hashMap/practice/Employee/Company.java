package lessons.lesson_28_hashMap.practice.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

    private Map<String, Employee> employees;
    private Map<String, Department> departments;


    public Company() {
        employees = new HashMap<>();
        departments = new HashMap<>();
    }


    public void addEmployee(String id, String nameEmployee){
        Employee employee = new Employee(id, nameEmployee);
        employees.put(id, employee);
    }


    public void addDepartment(String name){
        Department department = new Department(name);
        departments.put(name, department);

    }


    public void addEmployeeToDepartment(String employeeId, String departmentName){
        Employee employee = employees.get(employeeId);
        Department department = departments.get(departmentName);
        if (employee != null && department != null) {
            department.addEmployee(employee);
        }
    }


//    public void printEmployeesByDepartment() {
//        System.out.println("Employees by Department:");
//        for (Map.Entry<String, Department> departmentEntry : departments.entrySet()) {
//            System.out.println("Department: " + departmentEntry.getKey());
//            List<Employee> employeesInDepartment = departmentEntry.getValue().getEmployees();
//            for (Employee employee : employeesInDepartment) {
//                System.out.println(" - " + employee.getId() + ": " + employee.getName());
//            }
//        }
//    }


    public void printEmployeesByDepartment() {
        System.out.println("Employees by Department:");
        for (Department department : departments.values()) {
            System.out.println("Department: " + department.getName());
            List<Employee> employeesInDepartment = department.getEmployees();
            for (Employee employee : employeesInDepartment) {
                System.out.println(" - " + employee.getId() + ": " + employee.getName());
            }
        }
    }



//    public void printAllDepartments() {
//        System.out.println("All Departments:");
//        for (String departmentName : departments.keySet()) {
//            System.out.println("- " + departmentName);
//        }
//    }

    public void printAllDepartments() {
    System.out.println("All Departments:");
    for (Department department : departments.values()) {
        System.out.println("- " + department.getName());
    }
}


}
