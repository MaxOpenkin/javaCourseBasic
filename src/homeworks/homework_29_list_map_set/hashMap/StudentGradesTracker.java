package homeworks.homework_29_list_map_set.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentGradesTracker {

    public static void main(String[] args) {

        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Николай Басков", 4.5);
        studentGrades.put("Филипп Киркоров", 3.8);
        studentGrades.put("Михаил Шуфутинский", 4.8);
        studentGrades.put("Григорий Лепс", 4.2);
        studentGrades.put("Лев Лещенко", 4.0);
        System.out.println("Список студентов: " + studentGrades);


        String topStudent =  Collections.max(studentGrades.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Студент с наивысшим средним баллом: " + topStudent);


        String studentNameToChangeGrade = "Филипп Киркоров";
        System.out.println("Меняем оценку: " + studentNameToChangeGrade);
        studentGrades.put("Филипп Киркоров", 2.6);
        System.out.println("Обновленные данные студентов: " + studentGrades);

        System.out.println("Обновленные данные студентов:");
        studentGrades.forEach((name, grade) -> System.out.println(name + ": " + grade));

    }
}
