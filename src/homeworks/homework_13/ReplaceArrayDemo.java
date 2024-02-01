package homeworks.homework_13;

import java.util.Arrays;
import java.util.Random;

public class ReplaceArrayDemo {

    public static void main(String[] args) {

        //int[] myArray1 = {8,2,48,35,7,13,16,9};
        //int[] myArray1 = new Random().ints(8, 1, 51).toArray();


        ArrayServiceX service = new ArrayServiceX();

        int[] array = service.createArrayTask1();

        service.replaceOddIndicesWithZero(array);


        //int[] myArray2 = {10,86,17,99,42};
        //int[] myArray2 = new Random().ints(5, 10, 99).toArray();


        int[] array1 = service.createArrayTask2();

        service.checkStrictlyIncreasing(array1);

    }
}
