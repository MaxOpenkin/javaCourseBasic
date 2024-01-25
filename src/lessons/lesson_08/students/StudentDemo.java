package lessons.lesson_08.students;

public class StudentDemo {
    public static void main(String[] args) {

        StudentUtil studentUtil = new StudentUtil();
        Student student1 = studentUtil.createStudent();
        student1.printStudent();

    }
}
