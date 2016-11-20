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
public class BookList {
    public class ElemNotFound extends Exception{ };
    private BNode<Book> head;
 
    
   public BookList(){
   head = new BNode<Book>(null,null);
   }
       
   public void addBook (Book newBook){
   BNode<Book> tmp = head;
   while (tmp.getNext()!= null){
   tmp = tmp.getNext();
   }
   BNode<Book> newNode = new BNode<>(newBook);
   tmp.setNext(newNode);
   System.out.println("added");//debug
   }
   
   
   public void deleteBook (Book delBookTitle) throws ElemNotFound{
   BNode<Book> tmp = head.getNext();
   BNode<Book> tmpA = head;
   while(tmp != null && !tmp.getBookInfo().equals(delBookTitle)){
   tmpA = tmp;
   tmp = tmp.getNext();
   }
   if (tmp == null){
   throw new ElemNotFound();
   }else{
   tmpA.setNext(tmp.getNext());
   }    
   }
   
   public void displayBook (Book dispBookTitle) throws ElemNotFound{
   
   BNode<Book> tmp = head.getNext();
   BNode<Book> tmpA = head;
   while(tmp != null && !tmp.getBookInfo().equals(dispBookTitle)){
   tmpA = tmp;
   tmp = tmp.getNext();
   }
   if (tmpA == null){
   throw new ElemNotFound();
   }else{
   System.out.println(tmpA.getBookInfo());
   }    
   }
    
//   public void checkIn (String checkInBook){
//   checkInBook.setBorrowerName("");
//   checkInBook.setCheckOutDate("");
//   }
    
   public void checkOut (Book checkInBook, String newBorrowerName, String checkOutDate){
   checkInBook.setBorrowerName(newBorrowerName); 
   checkInBook.setCheckOutDate(checkOutDate);
   }
   
    
   
   
}
