package lessons.lesson_08.students;

public class Student {

    private String surName;

    private String firstName;

    private int studentTicket;

    private String numberGroup;

    private Group group;


    public Student(String surName, String firstName, int studentTicket, String numberGroup, Group group) {
        this.surName = surName;
        this.firstName = firstName;
        this.studentTicket = studentTicket;
        this.numberGroup = numberGroup;
        this.group = group;
    }

    public void printStudent(){
        System.out.println("Name: " + surName + " " + firstName);
        System.out.println("studentTicket: " + studentTicket);
        System.out.println(" numberGroup: " + numberGroup);
        group.printGroup();
    }
}
