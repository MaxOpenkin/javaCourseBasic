package homeworks.homework_36.collections.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class PersonDemo {
    public static void main(String[] args) {

        Set<Person> persons = new LinkedHashSet<>();

        persons.add(new Person("Alex", 21));
        persons.add(new Person("Bob", 27));
        persons.add(new Person("Bill", 19));
        persons.add(new Person("Olga", 32));
        persons.add(new Person("Maria", 30));

        System.out.println(persons);

        for (Person person : persons){
            if (person.getAge() < 30){
                System.out.println(person);
            }
        }

    }
}
