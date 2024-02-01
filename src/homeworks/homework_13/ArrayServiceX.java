package homeworks.homework_13;

import java.util.Arrays;

public class ArrayServiceX {

    public void replaceOddIndicesWithZero (int[] myArray1) {
        for (int i = 1; i < myArray1.length; i = i + 2) {
            myArray1[i] = 0;
        }
        System.out.println("Массив после замены элементов с нечетным индексом на ноль: " + Arrays.toString(myArray1));
    }

    public void checkStrictlyIncreasing (int[] myArray2){
        for (int i = 1; i < myArray2.length; i++) {
            if (myArray2[i] <=  myArray2[i - 1]){
                System.out.println("Массив не является строго возрастающей последовательностью.");
                return;
            }
        }
        System.out.println("Массив является строго возрастающей последовательностью.");
    }

}
