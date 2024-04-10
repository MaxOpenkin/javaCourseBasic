package lessons.lesson_41_exception.exception.validation;


import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class ValidationExample {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        String userName = ui.inputText("Введите ваше имя: ");

        System.out.println(checkUserName(userName));

    }

    static boolean checkUserName(String name){
        if (name.length() < 3) return false;
        if (name.length() > 15) return false;
        if (name.contains("&")) return false;

        return true;

    }
}