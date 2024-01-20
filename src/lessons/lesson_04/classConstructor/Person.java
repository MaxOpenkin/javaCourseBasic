package lessons.lesson_04.classConstructor;

public class Person {
    String firstName;
    String surName;
    String birthday;
    int age;
    String address;

    // Однофамильцы начинать с this.

    public Person(String firstName, String surName, String birthday) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthday = birthday;

    }
}
