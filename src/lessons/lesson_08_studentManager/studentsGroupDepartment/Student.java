package lessons.lesson_08_studentManager.studentsGroupDepartment;

public class Student {

    private String lastName;
    private String firstName;
    private String studentCardNumber;
    private Group group;

    public Student(String lastName, String firstName, String studentCardNumber, Group group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentCardNumber = studentCardNumber;
        this.group = group;
    }


    public void printStudentInfo(){
        System.out.println("Last name: " + lastName);
        System.out.println("First name: " + firstName);
        System.out.println("StudentDemo card number: " + studentCardNumber);
        System.out.println("Name group: " + group);
    }
}
