package lessons.lesson_27_linkedList_taimer.lessonWork;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseId;
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(String courseId, String name, Teacher teacher) {
        this.courseId = courseId;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        teacher.addCourse(this);
    }

    // Методы для добавления студента и геттеры
    public void addStudent(Student student){
        students.add(student);
    }
    public String getCourseId() {
        return courseId;
    }
    public String getName() {
        return name;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public List<Student> getStudents() {
        return students;
    }

}

