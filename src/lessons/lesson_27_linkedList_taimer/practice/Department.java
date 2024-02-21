package lessons.lesson_27_linkedList_taimer.practice;

public class Department {

    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }



    @Override
    public String toString() {
        return "Department{" +
                "name='" + departmentName + '\'' +
                '}';
    }
}
