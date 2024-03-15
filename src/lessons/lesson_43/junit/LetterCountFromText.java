package lessons.lesson_43.junit;

public class LetterCountFromText {

    public int countLetter(String text) {
        int count = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'u' || ch == 'y') {
                count++;
            }
        }

        return count;
    }
}
