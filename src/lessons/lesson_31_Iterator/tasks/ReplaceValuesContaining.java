package lessons.lesson_31_Iterator.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

public class ReplaceValuesContaining {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "apple");
        map.put("2", "banana");
        map.put("3", "avocado");
        map.put("4", "cherry");
        map.put("5", "orange");

        replaceValuesContainingA(map);

        System.out.println("Измененная коллекция: " + map);

    }

    public static void replaceValuesContainingA(Map<String, String> map) {
        Iterator<Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            if (entry.getValue().contains("a")) {
                entry.setValue("...");
            }
        }
    }

}
