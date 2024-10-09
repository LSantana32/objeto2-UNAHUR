package ar.unahur.edu.po2.LibraryManagementSystem;

public class Book {
    private final String title;
    private final String author;
    private final Integer isbn;
    private Boolean disponibility;

    public Book (String title, String author, Integer isbn, Boolean disponibility) {
        this.title =title;
        this.author = author;
        this.isbn = isbn;
        this.disponibility = disponibility;
    }

    public Boolean getDisponibility() {
        return this.disponibility;
    }

    public void changeDisponibility() {
        this.disponibility = !this.disponibility;
    }

}
