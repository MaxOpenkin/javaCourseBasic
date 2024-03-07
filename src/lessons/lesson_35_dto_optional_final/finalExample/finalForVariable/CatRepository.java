package lessons.lesson_35_dto_optional_final.finalExample.finalForVariable;

import java.util.ArrayList;
import java.util.List;

public class CatRepository {

    final List<Cat> cats ;

    public CatRepository() {
        this.cats = new ArrayList<>();
    }

//    public void changeCollection(ArrayList<Cat> newCollection){
//        cats = newCollection;
//    }
}
