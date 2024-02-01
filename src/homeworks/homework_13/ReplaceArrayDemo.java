package homeworks.homework_13;

import java.util.Arrays;

public class ReplaceArrayDemo {

    public static void main(String[] args) {

        int[] myArray1 = {8,2,48,35,7,13,16,9};

        System.out.println("Наш первый массив: " + Arrays.toString(myArray1));

        ArrayServiceX service = new ArrayServiceX();

        service.replaceOddIndicesWithZero(myArray1);

        int[] myArray2 = {10,86,17,99,42};

        System.out.println("Наш второй массив: " + Arrays.toString(myArray2));

        service.checkStrictlyIncreasing(myArray2);

    }
}
