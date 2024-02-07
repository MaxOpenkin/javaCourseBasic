package lessons.lesson_12_removeSymbols.removeSpecialSymbols;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class RemoveSymbolsDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        String text = userInput.inputText("Введите текст со специальными символами (например, @ или ())");

        RemoveSymbols removeSymbols = new RemoveSymbols();

        String resultText = removeSymbols.removeSpecialSymbols(text);

        System.out.print("Наш текст после удаления специальных символов: ");
        System.out.println(resultText);
    }
}
