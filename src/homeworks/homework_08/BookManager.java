package homeworks.homework_08;

import lessons.lesson_06.scanner.UserInput;

public class BookManager {

    private UserInput ui;

    public BookManager(){
        this.ui = new UserInput();
    }

    public Book createBookWithAuthorAndTitle(){
        System.out.println("Создание книги только с автором и названием: ");
        String bookAuthor = ui.inputText("Введите автора книги ");
        String bookTitle = ui.inputText("Введите название книги: ");

        return new Book(bookAuthor, bookTitle);
    }

    public Book createBookWithAllParameters(){
        System.out.println("Создание книги со всеми параметрами: ");
        String bookAuthor = ui.inputText("Введите автора книги ");
        String bookTitle = ui.inputText("Введите название книги: ");
        int pageCount = ui.inputInteger("Введите количество страниц в книге: ");
        int catalogNumber = ui.inputInteger("Введите номер книги в каталоге: ");
        String location = ui.inputText("Где находится книга: ");

        return new Book(bookAuthor, bookTitle, pageCount, catalogNumber, location);
    }

    public void editBookInfo(Book book){
        int newPageCount = ui.inputInteger("Введите новое количество страниц в книге: ");
        int newCatalogNumber = ui.inputInteger("Введите новый номер книги в каталоге: ");
        String newLocation = ui.inputText("Где теперь находится книга: ");

        book.editBook(newPageCount, newCatalogNumber, newLocation);
    }

}
