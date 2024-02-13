package lessons.lesson_21_interfaces.interfaces2;

public class Fish implements Swimming {
    @Override
    public void swim() {
        System.out.println("Плыви рыбка большая и маленькая!");
    }
}
