package consultations.cons_01.tasksStudents.students_ver_02;

public class Student {
    String surName;
    String firstName;
    double averageGrade;

    public Student(String surName, String firstName) {
        this.surName = surName;
        this.firstName = firstName;
    }

    public void addAverageGrade(double averageGrade){
        this.averageGrade = averageGrade;
    }

    public void printStudent() {
        System.out.println();
        System.out.println("Студент группы № ___");
        System.out.println("Фамилия: " + surName);
        System.out.println("Имя: " + firstName);
        System.out.println("Средний балл: " + averageGrade);
    }

}