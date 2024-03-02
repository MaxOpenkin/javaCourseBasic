package homeworks.projects_1.studentService;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

import java.util.Arrays;

public class StudentService {

    UserInput userInput = new UserInput();


    public Student[] createStudentsArrayFromUserInput() {
        int size = userInput.inputInteger("Введите количество студентов: ");
        return new Student[size];
    }


    private Student createStudentFromUserInput(){
        String lastName = userInput.inputText("Введите фамилию студента: ");
        String firstName = userInput.inputText("Введите имя студента: ");
        int age = userInput.inputInteger("Введите возраст студента: ");
        return new Student(lastName,firstName,age);
    }


    public void fillStudentsArrayFromUserInput(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i] = createStudentFromUserInput();
        }
    }


    public void sortStudents(Student[] students){
        Arrays.sort(students, (student1, student2) -> student1.getLastName().compareTo(student2.getLastName()));
    }


    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

}
