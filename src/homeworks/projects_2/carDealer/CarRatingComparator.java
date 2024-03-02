package homeworks.projects_2.carDealer;

import java.util.Comparator;

public class CarRatingComparator implements Comparator<Car> {


    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car2.getRating(), car1.getRating());
    }

}
