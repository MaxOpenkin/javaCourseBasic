package homeworks.homework_36.generics.genericsPair;

public class Pair <T1, T2> {

    // Создайте класс Pair с двумя полями - first и second, и реализуйте
    //    методы getFirst() и getSecond() для доступа к этим полям.
    //    Используйте Generics для возможности хранения в Pair объектов
    //    разных типов.


    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}
