package lessons.lesson_36_generics.generics.methods;

public interface GarbageHandler<T, S>{
    void handle(T what, S how);

    <E> void dangerousWasteTransfer(E dangerousWaste);

}
