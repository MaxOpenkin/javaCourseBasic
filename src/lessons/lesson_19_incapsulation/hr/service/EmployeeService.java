package lessons.lesson_19_incapsulation.hr.service;

import lessons.lesson_06_scanner_Random.scanner.UserInput;
import lessons.lesson_19_incapsulation.hr.entity.Applicant;
import lessons.lesson_19_incapsulation.hr.entity.Employee;
import lessons.lesson_19_incapsulation.hr.repositories.ApplicantRepository;
import lessons.lesson_19_incapsulation.hr.repositories.EmployeeRepository;

public class EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addNewEmployee(String applicantName){

        ApplicantRepository applicantRepository = new ApplicantRepository();

        Applicant applicant = applicantRepository.findByName(applicantName);

        UserInput userInput = new UserInput();
        int newEmployeeId = userInput.inputInteger("Введите номер нового сотрудника: ");
        String newEmployeePosition = userInput.inputText("Введите должность нового сотрудника: ");
        int newEmployeeSalary = userInput.inputInteger("Введите зарплату нового сотрудника: ");

        Employee newEmployee = new Employee(
                newEmployeeId,
                applicant.getPerson(),
                applicant.getDepartment(),
                newEmployeePosition,
                newEmployeeSalary
        );

        employeeRepository.add(newEmployee);

    }
}
