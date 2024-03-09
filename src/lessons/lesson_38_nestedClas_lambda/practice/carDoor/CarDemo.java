package lessons.lesson_38_nestedClas_lambda.practice.carDoor;

public class CarDemo {
    public static void main(String[] args) {

    Car myCar = new Car(4);

        Car.Door driverDoor = myCar.new Door(2.0, 1.5);

        driverDoor.open();
        System.out.println("Состояние двери: " + (driverDoor.isOpen() ? "открыта" : "закрыта"));

        driverDoor.close();
        System.out.println("Состояние двери: " + (driverDoor.isOpen() ? "открыта" : "закрыта"));
    }
}
