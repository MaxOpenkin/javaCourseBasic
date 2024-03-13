package lessons.lesson_39_functionalInterfaces.code.homework;

import java.util.List;

@FunctionalInterface
public interface Task6Interface<T> {
    public List<T> combineList(List<T> list1, List<T> list2);
}
