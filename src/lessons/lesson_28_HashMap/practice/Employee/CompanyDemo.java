package lessons.lesson_28_HashMap.practice.Employee;

public class CompanyDemo {

    public static void main(String[] args) {


        Company company = new Company();

        company.addEmployee("A1", "Hulk");
        company.addEmployee("A2", "Batman");
        company.addEmployee("A3", "Spiderman");
        company.addEmployee("A4", "Cheburashka");
        company.addEmployee("A5", "Sharkman");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("A1","HR");
        company.addEmployeeToDepartment("A2","HR");
        company.addEmployeeToDepartment("A3","IT");
        company.addEmployeeToDepartment("A4","IT");
        company.addEmployeeToDepartment("A5","IT");

        company.printEmployeesByDepartment();
        company.printAllDepartments();

    }
}
