package lessons.lesson_08.studentsGroupDepartment;

public class Group {

    private String nameDepartment;
    private String nameGroup;
    private String startDate;
    private int studentCount;


    public Group(String nameDepartment, String nameGroup, String startDate, int studentCount) {
        this.nameDepartment = nameDepartment;
        this.nameGroup = nameGroup;
        this.startDate = startDate;
        this.studentCount = studentCount;
    }


    @Override
    public String toString() {
        return "Group{" +
                "Name department='" + nameDepartment + '\'' +
                ", Name group='" + nameGroup + '\'' +
                ", Start date='" + startDate + '\'' +
                ", Student count=" + studentCount +
                '}';
    }
}
