package homeworks.homework_40_stream.studentAvgGrade;

public class Student {

    String name;
    int age;
    double avgGrade;

    // Конструктор
    public Student(String name, int age, double avgGrade) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
