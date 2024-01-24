package homeworks.homework_06.iStudyBasicJavaVer2;

public class IStudyBasicJavaVer2Demo {

    public static void main(String[] args) {

        IStudyBasicJavaVer2 iStudyBasicJavaVer2 = new IStudyBasicJavaVer2();

        String myString = new String("I study Basic Java!");

        int myTextLength = myString.length(); // Длина строки. Понадобится для вычисления последнего символа.

        System.out.println(myString);

        iStudyBasicJavaVer2.printMyString(myString);

        iStudyBasicJavaVer2.myStringLength(myTextLength);

        iStudyBasicJavaVer2.printLastCharAt(myString);

        iStudyBasicJavaVer2.checkString(myString);

        iStudyBasicJavaVer2.replaceCharacters(myString);

        iStudyBasicJavaVer2.convertToUpperCase(myString);

        iStudyBasicJavaVer2.convertToLowerCase(myString);

        iStudyBasicJavaVer2.substringFromMyString(myString);


        // Создаю новый экземпляр класса IStudyBasicJavaVer2 и обращаю методы к нему

        IStudyBasicJavaVer2 iStudyBasicJavaVer3 = new IStudyBasicJavaVer2();

        String myString1 = new String("Я учусь Джава!");

        int myTextLength1 = myString1.length();

        iStudyBasicJavaVer3.myStringLength(myTextLength1);

        iStudyBasicJavaVer3.convertToUpperCase(myString1);

    }
}
