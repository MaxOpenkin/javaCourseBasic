package homeworks.homework_09;

public class BookDemo {

    public static void main(String[] args) {

        BookManager manager = new BookManager();

        Book book1 = manager.createBookWithAuthorAndTitle();
        Book book2 = manager.createBookWithAllParameters();

        System.out.println("Информация о книгах: ");
        book1.printBookInfo();
        book2.printBookInfo();

        System.out.println("Отредактируйте книгу: " + book1);
        manager.editBookInfo(book1);

        System.out.println("Информация о книгах после внесения изменений: ");
        book1.printBookInfo();
        book2.printBookInfo();

        System.out.println("Спасибо, что работаете в нашей библиотеке!!!");
    }
}
