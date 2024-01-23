package addMaterials.extraHomework.addHomework2.task_1;

public class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }


    public Robot() {

    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
