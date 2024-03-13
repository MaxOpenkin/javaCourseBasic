package homeworks.homework_40_stream.studentAvgGrade;

import java.util.ArrayList;
import java.util.List;

public class StudentFilter {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", 20, 4.6));
        students.add(new Student("Светлана", 19, 4.8));
        students.add(new Student("Алексей", 21, 4.4));
        students.add(new Student("Мария", 18, 4.7));
        students.add(new Student("Николай", 22, 4.3));


        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() >= 18)
                .filter(student -> student.getAvgGrade() > 4.5)
                .toList();


        filteredStudents.forEach(System.out::println);
    }
}
