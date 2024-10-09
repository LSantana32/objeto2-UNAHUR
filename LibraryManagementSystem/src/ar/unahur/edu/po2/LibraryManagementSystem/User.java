package ar.unahur.edu.po2.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private final String name;
    private final Integer usernumber;
    private List<Book> booksInPossession;

    public User(String name, Integer usernumber){
        this.name=name;
        this.usernumber=usernumber;
        this.booksInPossession=new ArrayList<Book>();
    }

    public void getBook(Book book) {
        this.booksInPossession.add(book);
    }

    public void returnBook(Book book) {
        this.booksInPossession.remove(book);
    }


    public List<Book> getBooksInPossession() {
        return booksInPossession;
    }

    public abstract boolean canHaveABook();
}
