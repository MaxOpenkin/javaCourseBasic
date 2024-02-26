package lessons.lesson_30_treeSet_compareSort.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class DogDemo {
    public static void main(String[] args) {

        Set<Dog> dogs = new TreeSet<>();


        dogs.add(new Dog("Zeus", Breed.Mastiff));
        dogs.add(new Dog("Labrik", Breed.Labrador));
        dogs.add(new Dog("Lessy", Breed.Colly));
        dogs.add(new Dog("Muhtar", Breed.Shepard));

        System.out.println(dogs);
    }
}
