package lessons.lesson_22.task_2;

public class TextDemo {

    public static void main(String[] args) {

        TextService service = new TextService();

        String[] myTextArray = service.createArrayString();

        service.reverseArray(myTextArray);
        service.searchLongestWord(myTextArray);

    }
}
