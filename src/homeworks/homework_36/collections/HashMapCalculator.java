package homeworks.homework_36.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCalculator {
    public static void main(String[] args) {

        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 1; i < 10 + 1; i++) {
            numbersMap.put(i, i * i);
        }

        System.out.println("Элементы HashMap (число и его квадрат):");
        for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()){
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

    }

}
