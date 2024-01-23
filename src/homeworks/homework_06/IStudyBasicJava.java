package homeworks.homework_06;

public class IStudyBasicJava {

    public static void main(String[] args) {

        String myString = new String("I study Basic Java!");

        int myTextLength = myString.length();

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


    public static void printMyString (String myString){
        System.out.println("====================================");
        System.out.println("Полученная строка: " + myString);
    }

    public static int myStringLength (int myTextLength){
        System.out.println("Вычисление длины строки: " + myTextLength);
        return myTextLength;
    }

    public static void printLastCharAt(String myString){
        int length = myString.length();
        char lastChar = myString.charAt(length - 1);
        System.out.println("Последний символ строки: " + lastChar);
    }

    public static void checkString(String myString){
        boolean containsJava = myString.contains("Java");
        System.out.println("====================================");
        System.out.println("Строка содержит подстроку Java");
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

    public static void convertToLowerCase(String inputString){
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("====================================");
        System.out.println("Преобразуем строку к нижнему регистру");
        System.out.println("Было: " + inputString);
        System.out.println("Стало: " + lowerCaseString);
    }

    public static void substringFromMyString(String inputString){
        String substringFromMyString = inputString.substring(12, 16);
        System.out.println("====================================");
        System.out.println("Вырезаем подстроки с 12 по 16");
        System.out.println("Исходная строка: " + inputString);
        System.out.println("Вырезанная подстрока: " + substringFromMyString);
    }

}
