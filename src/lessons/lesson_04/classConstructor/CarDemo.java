package lessons.lesson_04.classConstructor;

public class CarDemo {
    public static void main(String[] args) {

        // Без конструктора так:

        Car myFirstCar = new Car();

        myFirstCar.producer = "Audi";
        myFirstCar.model = "A6";
        myFirstCar.maxSpeed = 280;

        myFirstCar.printCarData();

        Car mySecondCar = new Car();

        mySecondCar.producer = "Audi";
        mySecondCar.model = "S6";
        mySecondCar.maxSpeed = 300;

        mySecondCar.printCarData();

        // С конструктором так:

        Car myCarWithConstructor = new Car("Volvo", "S80", 260);
        myCarWithConstructor.printCarData();

    }
}
