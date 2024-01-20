package lessons.lesson_04.classConstructor;

public class Car {

    String model;

    String producer;

    int maxSpeed;

    public Car() {
    }

    // Конструктор
    public Car(String p, String m, int maxS) {
        model = m;
        producer = p;
        maxSpeed = maxS;
    }

    public void printCarData(){
        System.out.println("Характеристики автомобиля: ");
        System.out.println("Производитель - " + producer);
        System.out.println("Модель - " + model);
        System.out.println("Максимальная скорость - " + maxSpeed);
    }
}
