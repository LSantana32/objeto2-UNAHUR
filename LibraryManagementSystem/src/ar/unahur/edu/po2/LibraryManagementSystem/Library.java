package ar.unahur.edu.po2.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<Register> registers;

    public Library(){
        this.books=new ArrayList<>();
        this.registers=new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void registerBook(Book book){
        if(!books.contains(book)){
            books.add(book);
        }
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void addRegister(Register register){
        registers.add(register);
    }
    
    public void lendBook(User user, Book book, Integer loanData, Integer returnData) throws Exception {
        if (books.contains(book)) {
            if(user.canHaveABook()){
                book.changeDisponibility();
                registers.add(new Register(user,book,loanData,returnData));
                user.getBook(book);
            }else {
                throw new Exception("The user exceeds the number of books in possession");
            }
        }else {
            throw new Exception("The library does not have the book provided");
        }
    }

    public void returnBook(User user, Book book) throws Exception {
        if(user.getBooksInPossession().contains(book)){
            book.changeDisponibility();
            user.returnBook(book);
        } else {
            throw new Exception("The user does not have the book provided");
        }
    }



}
