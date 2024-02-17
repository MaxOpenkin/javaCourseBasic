package homeworks.projects_01.arrayService;

public class ArraySortDemo {

    public static void main(String[] args) {


        ArrayService service = new ArrayService();

        int[] ourWorkingArray = service.createArrayFromUserInput();

        service.fillArrayFromUserInput(ourWorkingArray);

        service.sortArray(ourWorkingArray);

        service.printArray(ourWorkingArray);

    }
}
