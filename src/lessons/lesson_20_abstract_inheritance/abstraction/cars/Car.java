package lessons.lesson_20_abstract_inheritance.abstraction.cars;

public abstract class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void printModel(){
        System.out.println("Model name: " + model);
    }

    abstract void beep();

    abstract int speedUp();
}
