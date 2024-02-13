package lessons.lesson_20_abstract_inheritance.inheritance.dog;

public class Dog {

    private String name;
    private String breed;


    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void voice(String message){
        System.out.println(message);
        System.out.println("GAV GAV");

    }

}
