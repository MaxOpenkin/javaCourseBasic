package homeworks.homework_06;

import java.util.Scanner;
public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String firstWord = scanner.nextLine();

        System.out.print("Введите второе слово: ");
        String secondWord = scanner.nextLine();

        scanner.close();


        String firstHalf = firstWord.substring(0, firstWord.length() / 2);
        String secondHalf = secondWord.substring(secondWord.length() / 2);

        String resultWord = firstHalf + secondHalf;

        System.out.println("Результат первой части первого слова и второй части второго слова: " + resultWord);

    }
}
