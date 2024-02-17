package lessons.lesson_23.zoo;

public class ZooApp {
    public static void main(String[] args) {
        ZooArray zooArray = new ZooArray(5);

        zooArray.createAllAnimals();

        zooArray.animalOperations();
    }
}
