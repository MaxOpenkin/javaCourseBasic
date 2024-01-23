package addMaterials.extraHomework.addHomework2.task_3;

public class Task_14_Book {
    String title;

    Task_14_Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}

class TaskBookDemo {

    public static void main(String[] args) {
        Task_14_Book myBook = new Task_14_Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
