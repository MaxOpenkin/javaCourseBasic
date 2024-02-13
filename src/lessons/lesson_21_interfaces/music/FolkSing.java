package lessons.lesson_21_interfaces.music;

public class FolkSing implements Singer{
    @Override
    public void sing() {
        System.out.println("FOLK!");
    }
}
