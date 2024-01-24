package homeworks.homework_06.scannerExampleVer2;

import java.util.Scanner;

public class ScannerVer2 {

    public String inputTextFromKeyboard (String message){
        System.out.println(message);
        Scanner scannerVer2 = new Scanner(System.in);
        String userText = scannerVer2.nextLine();

        return userText;

    }
}
