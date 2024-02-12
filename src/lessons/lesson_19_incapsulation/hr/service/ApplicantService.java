package lessons.lesson_19_incapsulation.hr.service;

import lessons.lesson_06_scanner_Random.scanner.UserInput;
import lessons.lesson_19_incapsulation.hr.entity.Applicant;
import lessons.lesson_19_incapsulation.hr.entity.Department;
import lessons.lesson_19_incapsulation.hr.entity.Person;
import lessons.lesson_19_incapsulation.hr.repositories.ApplicantRepository;

public class ApplicantService {

    ApplicantRepository applicantRepository;

    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public void addNewApplicant(Department department){
        UserInput userInput = new UserInput();
        int newApplicantId = userInput.inputInteger("Введите номер соискателя: ");
        String newApplicantName = userInput.inputText("Введите имя соискателя: ");
        String newApplicantSpeciality = userInput.inputText("Введите специальность соискателя: ");

        Person newPerson = new Person(newApplicantName, newApplicantSpeciality);

        Applicant newApplicant = new Applicant(newApplicantId, newPerson,department);

        applicantRepository.add(newApplicant);

    }

}
