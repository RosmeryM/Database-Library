/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarydatabase;

/**
 * @author rosme
 */
public class Book {
    String title;
    private String author;
    private String ISBN;
    private String borrowerName = "";
    private String checkOutDate = "";
    private String pendingRequest;
    private int daysToKeep;
    public Book next;
  
    public Book (){
    }
    
    public Book( String title, String author, String ISBN){
        title = this.title;
        author = this.author;
        ISBN = this.ISBN; 
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setBorrowerName(String borrowerName){
        this.borrowerName = borrowerName;
    }

    public void setCheckOutDate(String checkOutDate){
        this.checkOutDate = checkOutDate;
    }

    public void setPendingRequest(String pendingRequest){
        this.pendingRequest = pendingRequest;
    }

    public void setDaysToKeep(int daysToKeep){
        this.daysToKeep = daysToKeep;
    }
 
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getBorrowerName(){
        return borrowerName;
    }

    public String getCheckOutDate(){
        return checkOutDate;
    }

    public String getPendingRequest(){
        return pendingRequest;
    }

    public int getDaysToKeep(){
        return daysToKeep;
    }

    
    
    public String expectedReturnDay(String checkOutDate){
        String expectedReturn ="1/1/00";
        //to do find methos to calculate date
        return expectedReturn;       
    }
    
    public String Status(String checkOut){ 
        if (checkOut.isEmpty()){
        return "in";
        }else{
        return "out";
        }
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
   
}
