package ar.unahur.edu.po2.LibraryManagementSystem;

public class Register {
    private final User user;
    private final Book book;
    private final Integer loanDate;
    private final Integer returnDate;

    public Register(User user, Book book, Integer loanDate, Integer returnDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public Integer getLoanDate() {
        return loanDate;
    }

    public Integer getReturnDate() {
        return returnDate;
    }
}
