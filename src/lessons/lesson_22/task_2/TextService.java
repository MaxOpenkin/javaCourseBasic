package lessons.lesson_22.task_2;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

import java.util.Arrays;


public class TextService {

    UserInput userInput = new UserInput();

    public String[] createArrayString(){
        String myText = userInput.inputText("Введите строку, слова через пробел: ");
        String[] myTextArray = myText.split(" ");
        System.out.println("Массив слов из строки: " + (Arrays.toString(myTextArray)));
        return myTextArray;
    }


    public void reverseArray(String[] myTextArray) {

        for (int i = 0; i < myTextArray.length / 2; i++) {
            String temp = myTextArray[i];
            myTextArray[i] = myTextArray[myTextArray.length - 1 - i];
            myTextArray[myTextArray.length - 1 - i] = temp;
        }
        System.out.println("Массив в обратном порядке: " + (Arrays.toString(myTextArray)));
    }

    public void searchLongestWord(String[] myTextArray) {
        int longestWordIndex = 0;
        for (int i = 1; i < myTextArray.length; i++) {
            if (myTextArray[i].length() > myTextArray[longestWordIndex].length()) {
                longestWordIndex = i;
            }
        }
        String longestWord = myTextArray[longestWordIndex];
        System.out.println("Самое длинное слово: " + longestWord);
    }





}
