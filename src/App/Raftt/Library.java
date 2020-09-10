package App.Raftt;


import App.Raftt.Carti.Book;
import java.util.ArrayList;

public class Library {
    public ArrayList<Book> carti = new ArrayList<>();

    public void listOfCartiInLibrary() {

        System.out.println("The books in the list are: ");
        for (Book book : carti) {
            System.out.println(book);
        }

    }


    public void addBook( Book book ) {
        carti.add(book);

    }

    public void deleteBook( Book book ) {
        if (carti.contains(book)) {
            carti.remove(book);
            System.out.println("The removed book is: " + book);
        } else {
            System.out.println("The book doesn't exist in the library: " + book);
        }
    }

}
