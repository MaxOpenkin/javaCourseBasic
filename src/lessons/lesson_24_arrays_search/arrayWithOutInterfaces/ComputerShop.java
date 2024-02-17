package lessons.lesson_24_arrays_search.arrayWithOutInterfaces;


import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class ComputerShop {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        Sklad sklad = new Sklad();

        SkladOperations skladOperations = new SkladOperations();

        skladOperations.operations(ui,sklad);

    }
}
