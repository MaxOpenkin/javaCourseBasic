package lessons.lesson_39_functionalInterfaces.practice_lambdaAnonimous;

public class ClassObject {

    private String name;

    private String id;

    public ClassObject(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "ClassObject{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
