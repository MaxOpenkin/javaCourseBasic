package lessons.lesson_23.mediaLibrary;



import lessons.lesson_23.mediaLibrary.entity.Book;
import lessons.lesson_23.mediaLibrary.entity.Magazine;
import lessons.lesson_23.mediaLibrary.service.LibraryCatalog;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addMediaItem(new Book("The Hobbit", "Tolkien", 1935, 400));
        catalog.addMediaItem(new Magazine("National Geographic", "-----", 2023, 14));

        catalog.printAllItems();


    }
}
