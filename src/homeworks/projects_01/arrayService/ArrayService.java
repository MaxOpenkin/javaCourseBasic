package homeworks.projects_01.arrayService;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

import java.util.Arrays;

public class ArrayService {


    public int[] createArrayFromUserInput() {
        UserInput userInput = new UserInput();
        int size = userInput.inputInteger("Введите размер массива: ");
        int[] workingArray = new int[size];
        return workingArray;
    }


    public int[] fillArrayFromUserInput(int[] workingArray) {
        UserInput userInput = new UserInput();
        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = userInput.inputInteger("Введите значение " + i + "-ого элемента массива");
        }
        System.out.println("Сгенерированный массив: " + (Arrays.toString(workingArray)));
        return workingArray;
    }

    public void sortArray(int[] workingArray){
        Arrays.sort(workingArray);
        for (int i = 0; i < workingArray.length / 2; i++) {
            int temp = workingArray[i];
            workingArray[i] = workingArray[workingArray.length - 1 - i];
            workingArray[workingArray.length - 1 - i] = temp;
        }
    }

    public void printArray(int[] workingArray){
        System.out.println("Наш массив после сортировки по убыванию: " + (Arrays.toString(workingArray)));
    }


}
