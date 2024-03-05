package lessons.lesson_36_generics.genericsPractice.task_1;

import java.util.List;

public class Pair<T, U> {

    private List<T> first;
    private U second;

    public Pair(List<T> first, U second) {
        this.first = first;
        this.second = second;
    }

    public List<T> getFirst() {
        return first;
    }

    public void setFirst(List<T> first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
