package App;

import App.Raftt.Carti.Book;
import App.Raftt.Carti.ArtAlbums;
import App.Raftt.Carti.Novels;
import App.Raftt.Library;

public class AppLibraries {

    private static Book carti;

    public static void main( String[] args ) {
        Library library = new Library();

        library.addBook(new Novels("Indiana Jones", 150d, "Adventures"));
        library.addBook(new Novels("The Institute", 300d, "Horror"));
        library.addBook(new Novels("Odyssey One", 220d, "Adventure"));
        library.addBook(new ArtAlbums("Tiziano Vecelio", 100d, "Good."));
        library.addBook(new ArtAlbums("All Artists", 200d, "Normal"));

        library.addBook(new Novels("The Fly", 250d, "SF"));
        library.addBook(new Novels("The Macarena", 250d, "Adventure"));

        library.deleteBook(new Novels("Odyssey One", 220d, "Adventure"));
        library.deleteBook(new Novels("Abba", 22d, "Adventure"));

        library.listOfCartiInLibrary();


    }
}
