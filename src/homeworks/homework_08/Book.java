package homeworks.homework_08;

public class Book {

    private String bookAuthor;
    private String bookTitle;
    private int pageCount;
    private int catalogNumber;
    private String location;

    public Book(String bookAuthor, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.pageCount = 0;
        this.catalogNumber = 0;
        this.location = "Неизвестно";
    }

    public Book(String bookAuthor, String bookTitle, int pageCount, int catalogNumber, String location) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
        this.catalogNumber = catalogNumber;
        this.location = location;
    }

    public void editBook (int pageCount, int catalogNumber, String location){
        this.pageCount = pageCount;
        this.catalogNumber = catalogNumber;
        this.location = location;
    }

    public void printBookInfo() {
        System.out.println("----------------------------------------------");
        System.out.println("Автор книги: " + bookAuthor);
        System.out.println("Название книги: " + bookTitle);
        System.out.println("Количество страниц: " + pageCount);
        System.out.println("Номер в каталоге: " + catalogNumber);
        System.out.println("Местонахождение: " + location);
        System.out.println("----------------------------------------------");
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return " " + bookAuthor + " '" + bookTitle + "' ";
    }
}


