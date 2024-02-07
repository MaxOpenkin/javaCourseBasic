package lessons.lesson_08_studentManager.students;

public class StudentUtil {

    public Student createStudent(){
            Group group = new Group("Group A","14 Januar 2025","40","5");
        StudentScanner studentScanner = new StudentScanner();
        Student newStudent = new Student(
                studentScanner.inputText("Enter student Name: "),
                studentScanner.inputText("Enter student Surname: "),
                studentScanner.inputTextInt("Enter studentTicket number: "),"5", group);


        return newStudent;
    }
}
