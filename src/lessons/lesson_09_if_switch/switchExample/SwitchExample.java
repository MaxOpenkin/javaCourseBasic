package lessons.lesson_09_if_switch.switchExample;


import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class SwitchExample {

    public static void main(String[] args) {

        UserInput ui = new UserInput();

        String word = ui.inputText("Please enter any english word: ");

        switch (word) {
            case "coffee":
                System.out.println("Перевод этого слова: КОФЕ");
                break;

            case "tea":
                System.out.println("Перевод этого слова: ЧАЙ");
                //break;

            case "hello":
                System.out.println("Перевод этого слова: ПРИВЕТ");
                break;

            default:
                System.out.println("Этого я еще не знаю (((");

        }


    }
}
