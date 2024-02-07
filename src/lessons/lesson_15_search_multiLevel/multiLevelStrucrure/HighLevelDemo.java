package lessons.lesson_15_search_multiLevel.multiLevelStrucrure;

public class HighLevelDemo {
    public static void main(String[] args) {
        DataLowLevel dataLowLevel = new DataLowLevel("Whiskey");
        DataMiddleLevel dataMiddleLevel = new DataMiddleLevel("White Horse", dataLowLevel);
        DataHighLevel dataHighLevel = new DataHighLevel(1, dataMiddleLevel);

        System.out.println(dataHighLevel);
    }

}
