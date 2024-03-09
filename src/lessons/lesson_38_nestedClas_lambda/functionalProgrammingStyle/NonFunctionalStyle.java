package lessons.lesson_38_nestedClas_lambda.functionalProgrammingStyle;

import java.util.ArrayList;
import java.util.List;

public class NonFunctionalStyle {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        changeList(myList);

    }

    static void changeList(List<String> list){
        // изменял бы данные в коллекции
    }
}
