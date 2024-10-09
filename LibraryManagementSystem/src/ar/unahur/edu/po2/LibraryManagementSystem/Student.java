package ar.unahur.edu.po2.LibraryManagementSystem;

public class Student extends User{

    private Book book;

    public Student(String name, Integer usernumber) {
        super(name, usernumber);
    }

    @Override
    public boolean canHaveABook() {
        return this.getBooksInPossession().size()<1;
    }

}
