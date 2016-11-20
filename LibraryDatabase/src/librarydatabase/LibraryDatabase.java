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
public class LibraryDatabase {
 public class ElemNotFound extends Exception{ };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BookList.ElemNotFound {
        
        // TODO code application logic here
        BookList test = new BookList();
        Book trial = new Book("Hola","8","1243");
        Book trial2 = new Book("Verde","1","123");
        BNode<Book> test3 = new BNode(trial);
        BNode<Book> test23 = new BNode(trial2,test3);
        
        
        
        test.addBook(trial);
        test.addBook(trial2);
        test.deleteBook(trial2);
        test.displayBook(trial);
        
        
        
        
    }
    
}
