package lessons.lesson_09_if_switch.switchExample;


import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class SwitchExample2 {

    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int number = ui.inputInteger("Please enter any english word: ");

        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Число в диапазоне от 1 до 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Число в диапазоне от 4 до 6");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Число в диапазоне от 7 до 9");
                break;

            default:
                System.out.println("Этого я еще не знаю (((");

        }


    }
}
