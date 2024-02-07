package lessons.lesson_12_removeSymbols.elevator;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class ElevatorDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Elevator elevator = new Elevator();

        int totalFloors = userInput.inputInteger("Введите количество этажей в здании: ");
        int up = userInput.inputInteger("Введите количество этажей вверх: ");
        int down = userInput.inputInteger("Введите количество этажей вниз: ");


        int iterations = elevator.calculateIterations(totalFloors, up, down);

        System.out.println(iterations + " итераций подъема на крышу.");
    }
}
