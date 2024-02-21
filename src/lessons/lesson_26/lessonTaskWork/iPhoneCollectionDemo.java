package lessons.lesson_26.lessonTaskWork;

import java.util.ArrayList;

public class iPhoneCollectionDemo {

    public static void main(String[] args) {

        ArrayList<iPhone> iPhones = new ArrayList<>();

        System.out.println(iPhones.size());

        iPhones.add(new iPhone(1,"15","Apple", 999.99));

        System.out.println(iPhones.size());
        System.out.println("Новый элемент добавлен: " + iPhones.get(0));

        iPhones.add(new iPhone(2,"15 pro","Apple", 1999.99));
        iPhones.add(new iPhone(3,"15","Apple", 999.99));
        iPhones.add(new iPhone(4,"15 Max","Apple", 2999.99));
        iPhones.add(new iPhone(5,"15 pro Max","Apple", 3999.99));

        System.out.println(iPhones.size());
        System.out.println("Наша коллекция после добавления еще новых: " + iPhones);

        //iPhone iphoneToRemove = new iPhone(1,"15","Apple", 999.99);
        String iphoneToRemove = "15 pro Max";
        iPhones.remove(iphoneToRemove);
        System.out.println(iPhones.size());
        System.out.println("Наша коллекция после удаления по объекту: " + iPhones);

        iPhones.remove(0);
        System.out.println(iPhones.size());
        System.out.println("Наша коллекция после удаления по индексу: " + iPhones);
    }
}
