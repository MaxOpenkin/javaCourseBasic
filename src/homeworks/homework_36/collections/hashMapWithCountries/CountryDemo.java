package homeworks.homework_36.collections.hashMapWithCountries;

import java.util.*;

public class CountryDemo {

    public static void main(String[] args) {

        Map<Country, List<String>> countriesCities = new HashMap<>();

        countriesCities.put(new Country("Kazakhstan"), Arrays.asList("Astana", "Almaty", "Karaganda"));
        countriesCities.put(new Country("France"), Arrays.asList("Paris", "Lyon", "Marseille"));
        countriesCities.put(new Country("Germany"), Arrays.asList("Berlin", "Munich", "Hamburg"));
        countriesCities.put(new Country("Italy"), Arrays.asList("Rome", "Milan", "Naples"));
        countriesCities.put(new Country("Russian"), Arrays.asList("Moscow", "Kazan", "Novosibirsk"));

        TreeSet <Country> sortedCountries = new TreeSet<>(countriesCities.keySet());

        for (Country country : sortedCountries){
            System.out.println(country + " : " + countriesCities.get(country));
        }


    }
}
