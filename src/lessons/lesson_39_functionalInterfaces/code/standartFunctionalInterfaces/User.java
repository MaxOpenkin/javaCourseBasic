package lessons.lesson_39_functionalInterfaces.code.standartFunctionalInterfaces;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
