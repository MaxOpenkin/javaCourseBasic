package homeworks.homework_29_list_map_set.arrayList_reverse;

import java.util.ArrayList;

public class Students {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Себастьян Убегалов");
        students.add("Джон Конорович");
        students.add("Жан Клод");
        students.add("Митяй Вилкин");
        students.add("Валера Давай");


        System.out.println("Студентов в наличии: " + students.size());
        printList(students);


        System.out.println();
        System.out.println("Они же в обратном порядке: ");
        ArrayList<String> reverseListStudents = reverseList(students);
        printList(reverseListStudents);


        System.out.println();
        students.remove(2);
        System.out.println("Одного выгнали, теперь их осталось: " + students.size());
        printList(students);

    }

    private static void printList(ArrayList<String> students){
        System.out.print("Студенты: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + ", ");
        }
    }


    private static ArrayList<String> reverseList(ArrayList<String> students) {
        ArrayList<String> reverseList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            reverseList.add(students.get(students.size() - 1 - i));
        }
        return reverseList;
    }

}
