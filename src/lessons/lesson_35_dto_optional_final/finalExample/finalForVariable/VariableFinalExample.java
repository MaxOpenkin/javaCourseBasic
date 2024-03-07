package lessons.lesson_35_dto_optional_final.finalExample.finalForVariable;

public class VariableFinalExample {
    public static void main(String[] args) {

    final int LIMIT = 10;

        // LIMIT = 15; - при попытке изменить значение будет ошибка компиляции

        VariableFinalExample2 finalVar2 = new VariableFinalExample2(20);

}
}
