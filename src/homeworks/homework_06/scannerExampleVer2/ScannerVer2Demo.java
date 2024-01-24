package homeworks.homework_06.scannerExampleVer2;

public class ScannerVer2Demo {

    public static void main(String[] args) {

        ScannerVer2 scannerVer2 = new ScannerVer2();

        String word1 = scannerVer2.inputTextFromKeyboard("Please enter word 1: ");
        String word2 = scannerVer2.inputTextFromKeyboard("Please enter word 2: ");

        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);

        int firstWordLength = word1.length();
        int secondWordLength = word2.length();

        int middleIndexFirstWord = firstWordLength / 2 ;
        int middleIndexSecondWord = (int) Math.ceil(secondWordLength / 2.0);

        System.out.println(middleIndexFirstWord);
        System.out.println(middleIndexSecondWord);

        String firstPart = word1.substring(0, middleIndexFirstWord);
        String secondPart = word2.substring(middleIndexSecondWord);

        String mergeWord = firstPart + secondPart;

        System.out.println("Результат слияния: " + mergeWord);

    }

}
