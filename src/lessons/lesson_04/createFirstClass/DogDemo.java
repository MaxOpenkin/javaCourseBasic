package lessons.lesson_04.createFirstClass;

public class DogDemo {

    public static void main(String[] args) {

        int ageDog1 = 3;
        double weightDog1 = 50.5;

        int ageDog2 = 2;
        double weightDog2 = 10.5;


        // Экземпляр 1 класса Dog:

        Dog dog1 = new Dog();

        System.out.println(dog1);

        dog1.age = 4;
        dog1.weight = 62.3;

        System.out.println(dog1.age);
        System.out.println(dog1.weight);

        // Экземпляр 2 класса Dog:

        Dog dog2 = new Dog();

        dog2.age = 3;
        dog2.weight = 10;

        System.out.println("Dog2: " + "age = " + dog2.age + ", weight = " + dog2.weight);



    }
}
