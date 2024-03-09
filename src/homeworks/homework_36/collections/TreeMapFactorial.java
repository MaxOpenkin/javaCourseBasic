package homeworks.homework_36.collections;

import java.util.TreeMap;

public class TreeMapFactorial {

    public static void main(String[] args) {

        TreeMap<Integer, Long> factorialMap = new TreeMap<>();


        for (int i = 1; i < 10 + 1; i++) {
            factorialMap.put(i, factorial(i));
        }


        System.out.println("Число и его факториал:");
        for (Integer key : factorialMap.keySet()) {
            System.out.println(key + " -> " + factorialMap.get(key));
        }
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }

}
