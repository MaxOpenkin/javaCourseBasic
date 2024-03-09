package homeworks.homework_36.collections.priorityTaskQueue;

public class Task implements Comparable<Task> {

    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Отрицательное значение для инверсии порядка (чтобы элементы с высшим приоритетом были в начале)
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
