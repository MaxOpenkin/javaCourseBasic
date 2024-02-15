package homeworks.homework_21.navigationSystem;

public class CarNavigationSystem extends NavigationSystem{
    @Override
    void startNavigation() {
        System.out.println("Начинаем поездку на автомобиле.");
    }

    @Override
    void stopNavigation() {
        System.out.println("Закончили поездку на автомобиле.");
    }
}
