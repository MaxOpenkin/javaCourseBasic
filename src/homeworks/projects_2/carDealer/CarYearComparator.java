package homeworks.projects_2.carDealer;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {

    private boolean ascending;

    public CarYearComparator(boolean ascending) {
        this.ascending = ascending;
    }


    @Override
    public int compare(Car car1, Car car2) {
        if (ascending) {
            // Сортировка по возрастанию года выпуска
            return Integer.compare(car1.getYear(), car2.getYear());
        } else {
            // Сортировка по убыванию года выпуска
            return Integer.compare(car2.getYear(), car1.getYear());
        }
    }

}
