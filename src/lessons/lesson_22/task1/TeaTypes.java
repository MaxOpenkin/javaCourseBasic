package lessons.lesson_22.task1;

import java.util.Arrays;

public class TeaTypes {
    private String[] teaTypes = {"black","green","herbal","fruits"};

    public String[] getTeaTypes() {
        return teaTypes;
    }

    @Override
    public String toString() {
        return "TeaTypes{" +
                "teaTypes=" + Arrays.toString(teaTypes) +
                '}';
    }
}
