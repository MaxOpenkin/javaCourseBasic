package lessons.lesson_35_dto_optional_final.optional.withOptional;

public class Person {


    String name;

    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                '}';
    }
}
