package homeworks.projects_2.carDealer;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    private boolean ascending;

    public CarPriceComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Car car1, Car car2) {
        if (ascending) {
            // Сортировка по возрастанию цены
            return Double.compare(car1.getPrice(), car2.getPrice());
        } else {
            // Сортировка по убыванию цены
            return Double.compare(car2.getPrice(), car1.getPrice());
        }
    }


}

