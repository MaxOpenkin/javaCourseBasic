package lessons.lesson_32_stack_queue_deque.practice;

import java.util.Deque;
import java.util.LinkedList;

public class DequeuePalindrome {
    public static void main(String[] args) {

        String[] testString = {"Madam, I'm Adam", "A man, a plan, a canal: Panama", "Gulliver", "racecar"};

        for (String testPalindrome : testString) {
            System.out.println("\"" + testPalindrome + "\" is palindrome? " + isPalindrome(testPalindrome));
        }

    }


    public static boolean isPalindrome(String text) {
        Deque<Character> deque = new LinkedList<>();
        String formattedText = text.toLowerCase().replaceAll("[^a-z]", "");
        for (char ch : formattedText.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

}
