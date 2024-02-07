package lessons.lesson_15_search_multiLevel.hr;

import java.util.Arrays;

public class Firm {

    String companyName;
    Person director;
    Department[] departments;

    public Firm(String companyName, Person director, Department[] departments) {
        this.companyName = companyName;
        this.director = director;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "companyName='" + companyName + '\'' +
                ", director=" + director +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
