package App.Raftt.Carti;

import java.util.Objects;

public class Book {
    protected String name;
    protected double numOfPages;

    public Book( String name, double numOfPages ) {
        this.name = name;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(numOfPages, book.numOfPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfPages);
    }
}



