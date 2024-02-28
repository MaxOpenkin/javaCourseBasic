package homeworks.homework_29_list_map_set.hashMap;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

import java.util.HashMap;
import java.util.Map;

public class TranslationDictionary {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "привет");
        dictionary.put("world", "мир");
        dictionary.put("book", "книга");
        dictionary.put("computer", "компьютер");
        dictionary.put("apple", "яблоко");


        UserInput userInput = new UserInput();

        String word = userInput.inputText("Введите слово для перевода: ");

        if (dictionary.containsKey(word)) {
            System.out.println("Перевод слова " + word + ": " + dictionary.get(word));
        } else {
            System.out.println("Слово не найдено в словаре.");
        }

        System.out.println("Удаляем слово 'computer' из словаря...");
        dictionary.remove("computer");

        System.out.println(dictionary);

        System.out.println("Обновленный список слов в словаре:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }



    }
}
