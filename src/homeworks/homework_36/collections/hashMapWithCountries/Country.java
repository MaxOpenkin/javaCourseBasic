package homeworks.homework_36.collections.hashMapWithCountries;

import java.util.Objects;

public class Country implements Comparable<Country> {

    // Создать отображение HashMap, где ключом является объект класса Country,
    // а значением - список строк (названия городов в этой стране).
    // Затем добавить несколько городов для каждой страны
    // и вывести все страны на консоль в алфавитном порядке.

    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Country other) {
        return this.name.compareTo(other.name);
    }

}
