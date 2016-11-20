/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarydatabase;

/**
 *
 * @author rosme
 */
public class BNode<Book> {
    private Book bookInfo;

   private BNode<Book> next;
    
    public BNode(Book bookInfo, BNode<Book> next){
        this.bookInfo = bookInfo;
        this.next = next;
    }
    public BNode(Book bookInfo){
        this(bookInfo,null);    
    }
    
     public void setBookInfo(Book bookInfo) {
        this.bookInfo = bookInfo;
    }

    public void setNext(BNode<Book> next) {
        this.next = next;
    }

    public Book getBookInfo() {
        return bookInfo;
    }

    public BNode<Book> getNext() {
        return next;
    }
    
    
}
