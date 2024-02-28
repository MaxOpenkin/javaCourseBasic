package lessons.lesson_32_stack_queue_deque.dequeu;

public interface MyDeque {

    void addToHead(Integer element);

    void addToTail(Integer element);

    Integer removeHead();
    Integer removeTail();

    Integer peekHead();
    Integer peekTail();

    boolean isEmpty();

    boolean contains(Integer element);

    Integer getByIndex(int index);

}
