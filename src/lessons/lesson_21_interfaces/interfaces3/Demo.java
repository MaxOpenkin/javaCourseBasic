package lessons.lesson_21_interfaces.interfaces3;

public class Demo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Eagle eagle = new Eagle();

        Flying[] flyings = {duck, eagle};

        Swimming[] swimmings = {duck,fish};


    }
}
