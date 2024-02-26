package lessons.lesson_30_treeSet_compareSort.compareObjects.comparable;

import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {

    public static void main(String[] args) {

        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Филимонов", "Михаил"));
        persons.add(new Person("Филимонов", "Иван"));
        persons.add(new Person("Чайковский", "Михаил"));
        persons.add(new Person("Пароходов", "Григорий"));
        persons.add(new Person("Сидоров", "Василий"));
        persons.add(new Person("Сокольников", "Иван"));
        persons.add(new Person("Черный", "Леонид"));
        persons.add(new Person("Белый", "Саша"));

        for (Person person : persons) {
            System.out.println(person);
        }

    }

}
