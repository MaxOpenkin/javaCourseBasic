package homeworks.homework_36.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStringLengths {

    public static void main(String[] args) {

        TreeMap<String, Integer> stringLengths = new TreeMap<>();


        stringLengths.put("Zoom", "Zoom".length());
        stringLengths.put("World", "World".length());
        stringLengths.put("Java", "Java".length());
        stringLengths.put("TreeMap", "TreeMap".length());
        stringLengths.put("Slack", "Slack".length());


        System.out.println("Элементы TreeMap:");
        for (Map.Entry<String, Integer> entry : stringLengths.entrySet()) {
            System.out.println("Ключ: \"" + entry.getKey() + "\", Значение: " + entry.getValue());
        }
    }
}
