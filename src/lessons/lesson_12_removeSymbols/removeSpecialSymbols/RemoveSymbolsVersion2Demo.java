package lessons.lesson_12_removeSymbols.removeSpecialSymbols;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class RemoveSymbolsVersion2Demo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        RemoveSymbolsVersion2 newText = new RemoveSymbolsVersion2();

        String text = userInput.inputText("Введите текст со специальными символами (например, @ или ())");

        String resultText = newText.removeSpecialSymbols(text);

        System.out.println("Текст после удаления специальных символов: " + resultText);
    }
}
