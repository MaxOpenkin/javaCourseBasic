package lessons.lesson_24_arrays_search.arrayWithOutInterfaces;


import lessons.lesson_06_scanner_Random.scanner.UserInput;

import java.util.Arrays;

public class SkladOperations {

    public void operations(UserInput ui, Sklad sklad){

        sklad.fillSklad();

        String searchName = ui.inputText("Введите название для поиска");

        System.out.println(Arrays.toString(sklad.finByName(searchName)));
    }
}
