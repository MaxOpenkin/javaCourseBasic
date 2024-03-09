package consultations.cons_01.tasksStudents.students_ver_01;

public class Student {
    String surName;
    String firstName;
    double averageGrade;

    public Student(String surName, String firstName, double averageGrade) {
        this.surName = surName;
        this.firstName = firstName;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
