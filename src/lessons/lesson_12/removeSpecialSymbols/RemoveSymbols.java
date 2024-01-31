package lessons.lesson_12.removeSpecialSymbols;

public class RemoveSymbols {

    public String removeSpecialSymbols(String text) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            switch (ch) {
                case '(':
                case ')':
                case '@':
                    // Пропускаем специальные символы
                    break;
                default:
                    // Добавляем остальные символы к результату
                    result.append(ch);
                    break;
            }
        }

        return result.toString();
    }
}
