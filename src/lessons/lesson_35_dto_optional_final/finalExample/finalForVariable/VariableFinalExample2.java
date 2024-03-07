package lessons.lesson_35_dto_optional_final.finalExample.finalForVariable;

public class VariableFinalExample2 {

    final int LIMIT;

    // переменная инициализируется через конструктор и более не изменяется

    public VariableFinalExample2(int limit) {
        LIMIT = limit;
    }

    // невозможно создать метод для изменения значения
//    public void changeLimit(int newLimit){
//        LIMIT = newLimit;
//    }
}
