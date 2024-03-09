package homeworks.homework_36.collections.studentArrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Беркович", 87));
        students.add(new Student("Иванович", 83));
        students.add(new Student("Васильевич", 98));
        students.add(new Student("Петрович", 92));


        // Сортировка списка по оценке в порядке убывания
        Collections.sort(students, (s1, s2) -> {
            return s2.getGrade() - s1.getGrade(); // Обратный порядок для сортировки по убыванию
        });


        System.out.println("Отсортированный список студентов по оценкам:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
