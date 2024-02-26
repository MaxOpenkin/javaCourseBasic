package lessons.lesson_30_treeSet_compareSort.compareObjects.comparator;

import java.util.Objects;

public class Pair {

    private int id;
    private String name;

    public Pair(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return id == pair.id && Objects.equals(name, pair.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
