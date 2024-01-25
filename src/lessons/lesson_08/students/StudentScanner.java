package lessons.lesson_08.students;

import java.util.Scanner;

public class StudentScanner {

    public String inputText(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        String inputText = scanner.nextLine();
        return inputText;
    }

    public int inputTextInt(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        int inputText = scanner.nextInt();
        return inputText;
    }
}
