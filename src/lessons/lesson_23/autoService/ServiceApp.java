package lessons.lesson_23.autoService;

import lessons.lesson_23.autoService.entity.Car;
import lessons.lesson_23.autoService.entity.Truck;
import lessons.lesson_23.autoService.service.ServiceManager;

public class ServiceApp {
    public static void main(String[] args) {
        ServiceManager manager = new ServiceManager();

        Car car = new Car("1GHJGJGFH65465JGVJ", "Honda", "Civic", 2020);
        Truck truck = new Truck("2JGKJ67865HJGHJG", "Ford", "F-150", 2010);
        //manager.addVehicle(car);
        //manager.addVehicle(truck);

        //manager.assignService(car, "Repair: Oil change");
        //manager.assignService(truck,"Repair: Brake replacement");

        manager.printServiceStatus(0);

    }
}
