package homeworks.homework_38_functionalInterface.task_1;

public class UpperCaseConverter {
    public static void main(String[] args) {

        StringConverter toUpperCaseConverter = input -> input.toUpperCase();

        String originalString = "сегодня хорошая погода";
        String upperCaseString = toUpperCaseConverter.convert(originalString);
        System.out.println(upperCaseString);

    }
}
