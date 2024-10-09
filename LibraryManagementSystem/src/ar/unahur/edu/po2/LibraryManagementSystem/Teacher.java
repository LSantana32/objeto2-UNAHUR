package ar.unahur.edu.po2.LibraryManagementSystem;

public class Teacher extends User{
    public Teacher(String name, Integer usernumber) {
        super(name, usernumber);
    }

    @Override
    public boolean canHaveABook() {
        return this.getBooksInPossession().size()<3;
    }
}
