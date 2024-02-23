package lessons.lesson_29.practice;

public class StudentGradesDemo {

    public static void main(String[] args) {

        StudentGrades service = new StudentGrades();

        service.addGrade("Кирилл Обливков", "Математика", 4);
        service.addGrade("Себастьян Убегалов", "Физика", 5);
        service.addGrade("Джон Франшизов", "Рисование", 3);
        service.addGrade("Себастьян Убегалов", "Математика", 2);

        service.printGrades("Кирилл Обливков");
        service.printGrades("Себастьян Убегалов");
        service.printGrades("Иван Обкрадов");

    }
}
