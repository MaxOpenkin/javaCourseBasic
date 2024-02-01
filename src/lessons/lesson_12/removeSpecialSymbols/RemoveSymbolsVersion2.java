package lessons.lesson_12.removeSpecialSymbols;

public class RemoveSymbolsVersion2 {

    String removeSpecialSymbols(String text) {
        String result = new String();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (currentChar != '(' && currentChar != ')' && currentChar != '@') {
                result = result + currentChar;
            }
        }
        return result;
    }
}
/*
Этот код запрашивает у пользователя текст, а затем использует цикл для прохода по каждому символу текста.
Если символ не является одним из указанных специальных символов (, ), @, то он добавляется к результату.
В конце программа выводит текст после удаления специальных символов.
append - добавить
 */