package addMaterials.extraHomework.addHomework2.task_6;

public class Dog {

    String name;

    int age;

    String color;

    String newColor;

    public Dog(String name, String color, int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void voiceDog(){

        System.out.println("Собаку зовут " + name + " ей " + age + " лет и ее цвет " + color);
    }

    public void happyBirthday (String textMessage) {
        System.out.println(textMessage);
        System.out.println("У моей собаки сегодня ДР!");
        System.out.println("Ей было " + age + " лет");
        age = age + 1;
        System.out.println("А теперь ей " + age);
    }

    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Собака сменила цвет ");
    }

}
