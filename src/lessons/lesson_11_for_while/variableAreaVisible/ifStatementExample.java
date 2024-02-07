package lessons.lesson_11_for_while.variableAreaVisible;


import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class ifStatementExample {
    public static void main(String[] args) {


        String text;

        UserInput userInput = new UserInput();

        if (userInput.inputInteger("Please enter number:") > 0 ) {

             text = "Положительное число";

        } else {
             text = "отрицательное число";
        }

        System.out.println(text);


    }
}
