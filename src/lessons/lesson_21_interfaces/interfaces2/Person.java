package lessons.lesson_21_interfaces.interfaces2;

public class Person  implements Swimming {
    @Override
    public void swim() {
        System.out.println("Пловец кролем!");
    }
}
