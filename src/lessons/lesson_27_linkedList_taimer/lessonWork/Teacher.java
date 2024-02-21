package lessons.lesson_27_linkedList_taimer.lessonWork;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String teacherId;
    private String name;
    private ArrayList<Course> courses;

    public Teacher(String id, String name) {
        this.teacherId = teacherId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
    public String getId() {
        return teacherId;
    }
    public String getName() {
        return name;
    }
    public List<Course> getCourses() {
        return courses;
    }
}

