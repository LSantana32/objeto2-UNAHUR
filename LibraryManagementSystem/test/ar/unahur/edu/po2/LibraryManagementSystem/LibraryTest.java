package ar.unahur.edu.po2.LibraryManagementSystem;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;


public class LibraryTest {

    Library library=new Library();
    User student= new Student("Pedro",1234);
    User student2= new Student("Peter",4321);
    Book book1= new Book("book1","author1",1,true);
    Book book2= new Book("book2","author2",2,true);

    @Test
    public void addABookCorrectly(){
        library.registerBook(book1);
        List<Book>expectedValue=List.of(book1);
        List<Book>actualValue= library.getBooks();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void doNotAddADuplicateBook(){
        library.registerBook(book1);
        library.registerBook(book1);
        List<Book>expectedValue=List.of(book1);
        List<Book>actualValue= library.getBooks();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void lendABookCorrectly() throws Exception {
        library.registerBook(book1);
        library.lendBook(student,book1,010124,010224);
        assertFalse(book1.getDisponibility());
    }

    @Test
    public void returnABookCorrectly() throws Exception {
        library.registerBook(book1);
        library.lendBook(student,book1,010124,010224);
        library.returnBook(student,book1);
        assertTrue(book1.getDisponibility());
    }







}