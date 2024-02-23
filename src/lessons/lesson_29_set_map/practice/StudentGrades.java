package lessons.lesson_29_set_map.practice;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {

    Map<String, Map<String, Integer>> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }


    public void addGrade (String studentName, String subject, int grade){
        Map<String, Integer> grades = studentGrades.get(studentName);
        if (grades == null) {
            grades = new HashMap<>();
            studentGrades.put(studentName, grades);
        }
        grades.put(subject, grade);
    }


    public void printGrades(String studentName){
        Map<String, Integer> grades = studentGrades.get(studentName);
        if (grades == null){
            System.out.println(studentName + " не найден.");
            return;
        }
        System.out.println("Оценки " + studentName + ": " + grades);
    }


}
