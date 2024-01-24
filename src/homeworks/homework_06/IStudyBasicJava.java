package homeworks.homework_06;

public class IStudyBasicJava {

    // Здесь методы статичные и они выполняются только со строкой и эта строка одна, все в Мэин.
    // Строк можно создать 2 и более, но для новой строки нужны новые статичные методы конкретно для каждой строки в Мэин.

    public static void main(String[] args) {

        String myString = new String("I study Basic Java!");

        int myTextLength = myString.length(); // Длина строки. Понадобится для вычисления последнего символа.

        System.out.println(myString);

        printMyString(myString);

        myStringLength(myTextLength);

        printLastCharAt(myString);

        checkString(myString);

        replaceCharacters(myString);

        convertToUpperCase(myString);

        convertToLowerCase(myString);

        substringFromMyString(myString);

    }


    public static void printMyString(String myString){
        System.out.println("====================================");
        System.out.println("Полученная строка: " + myString);
    }

    public static int myStringLength(int myTextLength){
        System.out.println("Вычисление длины строки: " + myTextLength);
        return myTextLength;
    }


    public static void printLastCharAt(String myString){
        int length = myString.length();
        char lastChar = myString.charAt(length - 1); // charAt делаем длину -1, потому что начинается отсчет с 0.
        System.out.println("Последний символ строки: " + lastChar);
    }

    public static void checkString(String myString){
        boolean containsJava = myString.contains("Java");
        System.out.println("====================================");
        System.out.println("Строка содержит подстроку Java: " + containsJava); // Напишет true
    }

    public static void replaceCharacters(String myString){
        String modifiedString = myString.replace('a', 'o');
        System.out.println("====================================");
        System.out.println("Меняем все символы 'a' на 'o': ");
        System.out.println("Было: " + myString);
        System.out.println("Стало: " + modifiedString);
    }

    public static void convertToUpperCase(String myString){
        String upperCaseString = myString.toUpperCase();
        System.out.println("====================================");
        System.out.println("Преобразуем строку к верхнему регистру");
        System.out.println("Было: " + myString);
        System.out.println("Стало: " + upperCaseString);
    }

    public static void convertToLowerCase(String myString){
        String lowerCaseString = myString.toLowerCase();
        System.out.println("====================================");
        System.out.println("Преобразуем строку к нижнему регистру");
        System.out.println("Было: " + myString);
        System.out.println("Стало: " + lowerCaseString);
    }

    public static void substringFromMyString(String myString){
        String substringFromMyString = myString.substring(10, 13);
        System.out.println("====================================");
        System.out.println("Вырезаем подстроки с 10 по 13");
        System.out.println("Исходная строка: " + myString);
        System.out.println("Вырезанная подстрока: " + substringFromMyString); // Напишет sic
    }

}
