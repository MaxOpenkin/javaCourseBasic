package homeworks.homework_30_compareSort;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {

        Set<Flat> flats = new TreeSet<>();

        flats.add(new Flat(2, 61.4));
        flats.add(new Flat(3, 90.5));
        flats.add(new Flat(1, 46.0));
        flats.add(new Flat(2, 75.0));
        flats.add(new Flat(3, 85.7));
        flats.add(new Flat(1, 52.6));

        System.out.println("Квартиры, отсортированные по количеству комнат и затем по площади:");
        for (Flat flat : flats) {
            System.out.println(flat);
        }

    }
}
