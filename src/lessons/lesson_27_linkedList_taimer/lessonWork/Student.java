package lessons.lesson_27_linkedList_taimer.lessonWork;

public class Student {

    private String studentId;
    private String name;


    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

