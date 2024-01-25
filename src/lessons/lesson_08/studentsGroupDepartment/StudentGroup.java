package lessons.lesson_08.studentsGroupDepartment;

public class StudentGroup {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        System.out.println("Create new group and department: ");
        Group group = manager.createGroup();

        System.out.println("Create new student: ");
        Student student1 = manager.createStudent(group);
        Student student2 = manager.createStudent(group);
        Student student3 = manager.createStudent(group);

        System.out.println("Student info: ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
