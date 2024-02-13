package lessons.lesson_20_abstract_inheritance.abstraction.cars;

public class TruckCar extends Car{


    public TruckCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("TRUCK !!!");
    }

    @Override
    int speedUp() {
        System.out.println("ГРУЗОВИК");
        return 100;
    }
}
