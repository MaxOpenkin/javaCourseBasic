package homeworks.homework_06.iStudyBasicJavaVer2;

public class IStudyBasicJavaVer2 {

    // А здесь я прописал методы, и могу их использовать с любой новой строкой созданной как новый экземпляр
    // Это расширенный функционал

    public void printMyString(String myString){
        System.out.println("====================================");
        System.out.println("Полученная строка: " + myString);
    }

    public int myStringLength(int myTextLength){
        System.out.println("Вычисление длины строки: " + myTextLength);
        return myTextLength;
    }


    public void printLastCharAt(String myString){
        int length = myString.length();
        char lastChar = myString.charAt(length - 1); // charAt делаем длину -1, потому что начинается отсчет с 0.
        System.out.println("Последний символ строки: " + lastChar);
    }

    public void checkString(String myString){
        boolean containsJava = myString.contains("Java");
        System.out.println("====================================");
        System.out.println("Строка содержит подстроку Java: " + containsJava); // Напишет true
    }

    public void replaceCharacters(String myString){
        String modifiedString = myString.replace('a', 'o');
        System.out.println("====================================");
        System.out.println("Меняем все символы 'a' на 'o': ");
        System.out.println("Было: " + myString);
        System.out.println("Стало: " + modifiedString);
    }

    public void convertToUpperCase(String myString){
        String upperCaseString = myString.toUpperCase();
        System.out.println("====================================");
        System.out.println("Преобразуем строку к верхнему регистру");
        System.out.println("Было: " + myString);
        System.out.println("Стало: " + upperCaseString);
    }

    public void convertToLowerCase(String myString){
        String lowerCaseString = myString.toLowerCase();
        System.out.println("====================================");
        System.out.println("Преобразуем строку к нижнему регистру");
        System.out.println("Было: " + myString);
        System.out.println("Стало: " + lowerCaseString);
    }

    public void substringFromMyString(String myString){
        String substringFromMyString = myString.substring(10, 13);
        System.out.println("====================================");
        System.out.println("Вырезаем подстроки с 10 по 13");
        System.out.println("Исходная строка: " + myString);
        System.out.println("Вырезанная подстрока: " + substringFromMyString); // Напишет sic
    }
}
