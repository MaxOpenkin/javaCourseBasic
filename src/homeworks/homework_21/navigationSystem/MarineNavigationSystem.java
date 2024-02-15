package homeworks.homework_21.navigationSystem;

public class MarineNavigationSystem extends NavigationSystem{
    @Override
    void startNavigation() {
        System.out.println("Плывем на лодке по навигации.");
    }

    @Override
    void stopNavigation() {
        System.out.println("Приплыли! Стоп навигация.");
    }
}
