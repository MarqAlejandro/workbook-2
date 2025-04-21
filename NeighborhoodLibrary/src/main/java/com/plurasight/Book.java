package com.plurasight;

public class Book {                                                                 //Book class to store all book related data

    private int id;                                                                 //class variables are initialized
    private String isbn;
    private String title;
    private boolean isCheckOut;
    private String checkOutTo;

    public Book() {                                                                 //empty contructor
    }

    public Book(int id, String isbn, String title) {                                //main constructor
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckOut = false;
        this.checkOutTo = "";
    }

    public void displayBookInfo(){                                                  //prints out the book info, check out status, and check out name
        System.out.println("ID: " + getId() + "\t|ISBN: " + getIsbn() + "\t|Title: " + getTitle() + "\t|Check out?: " + getIsCheckOut() + "\t|Checked Out to: " + getCheckOutTo());
    }


    public void checkOut(String checkOutTo){                                        //check out method that requires a name arguement
        this.checkOutTo = checkOutTo;
        this.isCheckOut = true;
    }

    public void checkIn(){                                                          //check in method to reset a book object that is returning to the system
        this.checkOutTo = "";
        this.isCheckOut = false;
    }

    public int getId() {                                                            //various setters and getters for class variables
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

    public String getCheckOutTo() {
        return checkOutTo;
    }

    public void setCheckOutTo(String checkOutTo) {
        this.checkOutTo = checkOutTo;
    }
}

