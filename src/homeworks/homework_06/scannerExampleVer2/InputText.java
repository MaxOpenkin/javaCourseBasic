package homeworks.homework_06.scannerExampleVer2;

import java.util.Scanner;

public class InputText {

    public String inputTextFromKeyboard (String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        return userText;

    }
}
