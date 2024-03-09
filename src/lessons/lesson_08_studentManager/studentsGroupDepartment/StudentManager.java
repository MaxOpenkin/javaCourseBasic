package lessons.lesson_08_studentManager.studentsGroupDepartment;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class StudentManager {

    private UserInput ui;

    public StudentManager(){
        this.ui = new UserInput();
    }

    public Group createGroup(){
        String nameDepartment = ui.inputText("Name department: ");
        String nameGroup = ui.inputText("Name group: ");
        String startDate = ui.inputText("Start Date: ");
        int studentCount = ui.inputInteger("StudentDemo count: ");

        return new Group(nameDepartment, nameGroup, startDate, studentCount);
    }

    public Student createStudent(Group group){
        String lastName = ui.inputText("Last name: ");
        String firstName = ui.inputText("First name: ");
        String studentCardNumber = ui.inputText("StudentDemo card number: ");

        return new Student(lastName, firstName, studentCardNumber, group);
    }
}
