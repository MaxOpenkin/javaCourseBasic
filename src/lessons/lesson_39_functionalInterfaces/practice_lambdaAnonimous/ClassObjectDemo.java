package lessons.lesson_39_functionalInterfaces.practice_lambdaAnonimous;

import java.util.ArrayList;
import java.util.List;

public class ClassObjectDemo {
    public static void main(String[] args) {


        List<ClassObject> objects = new ArrayList<>();


        objects.add(new ClassObject("Kkk", "1"));
        objects.add(new ClassObject("Hhh", "2"));
        objects.add(new ClassObject("Aaa", "3"));
        objects.add(new ClassObject("Bbb", "4"));
        objects.add(new ClassObject("Jjj", "5"));

        objects.sort((o1, o2) -> o2.getId().compareTo(o1.getId()));

        for (ClassObject object : objects) {
            System.out.println(object);
        }

    }
}
