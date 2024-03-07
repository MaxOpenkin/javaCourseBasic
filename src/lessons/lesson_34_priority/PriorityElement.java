package lessons.lesson_34_priority;

public class PriorityElement {
    private int element;
    private int priority;

    public PriorityElement(int element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    public int getElement() {
        return element;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "PriorityElement{" +
                "element=" + element +
                ", priority=" + priority +
                '}';
    }
}
