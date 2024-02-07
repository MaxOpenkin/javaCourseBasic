package lessons.lesson_15_search_multiLevel.hr;

import java.util.Arrays;

public class Department {
    String departmentName;
    Person[] persons;

    public Department(String departmentName, Person[] persons) {
        this.departmentName = departmentName;
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", persons=" + Arrays.toString(persons) +
                '}';
    }
}
