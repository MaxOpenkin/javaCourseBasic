package lessons.lesson_38_nestedClas_lambda.innerClasses.carDoor;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car(4, 70, 100);
        car.openDoor(2);
        car.openDoor(2);
        car.closeDoor(2);
        car.closeDoor(2);

    }
}
