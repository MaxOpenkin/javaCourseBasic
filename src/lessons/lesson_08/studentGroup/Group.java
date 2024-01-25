package lessons.lesson_08.studentGroup;

public class Group {
    private String nameGroup;
    private String startStudy;
    private String countStudents;

    private String numberGroup;

    public Group(String nameGroup, String startStudy, String countStudents, String numberGroup) {
        this.nameGroup = nameGroup;
        this.startStudy = startStudy;
        this.countStudents = countStudents;
        this.numberGroup = numberGroup;
    }

    public void printGroup(){
        System.out.println("Group: " + nameGroup);
        System.out.println("startStudy: " + startStudy);
        System.out.println("countStudents: " + countStudents);
        System.out.println("numberGroup: " + numberGroup);
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public String getStartStudy() {
        return startStudy;
    }

    public String getCountStudents() {
        return countStudents;
    }

    public String getNumberGroup() {
        return numberGroup;
    }
}
