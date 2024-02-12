package lessons.lesson_19_incapsulation.hr;

import lessons.lesson_19_incapsulation.hr.entity.Department;
import lessons.lesson_19_incapsulation.hr.repositories.ApplicantRepository;
import lessons.lesson_19_incapsulation.hr.repositories.DepartmentRepository;
import lessons.lesson_19_incapsulation.hr.repositories.EmployeeRepository;
import lessons.lesson_19_incapsulation.hr.service.ApplicantService;
import lessons.lesson_19_incapsulation.hr.service.DepartmentService;
import lessons.lesson_19_incapsulation.hr.service.EmployeeService;

public class HrApp {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository(10);
        DepartmentRepository departmentRepository = new DepartmentRepository(4);
        ApplicantRepository applicantRepository = new ApplicantRepository();

        ApplicantService applicantService = new ApplicantService(applicantRepository);
        EmployeeService employeeService = new EmployeeService(employeeRepository);
        DepartmentService departmentService = new DepartmentService(departmentRepository);

        departmentService.createDepartments();
//        System.out.println(departmentRepository);
//
//        System.out.println(employeeRepository);
//        System.out.println(applicantRepository);

        Department[] departments = departmentRepository.getDepartments();

        applicantService.addNewApplicant(departments[0]);
        System.out.println(applicantRepository);

    }
}
