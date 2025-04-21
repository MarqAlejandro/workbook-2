package com.plurasight;

import java.util.Scanner;
public class LibrarySystem {

    private Book[] bookList = new Book[20];                                                                         //object array for book objects


    public Scanner scanner = new Scanner(System.in);                                                                //global Scanner object

    public void loadBooks(){                                                                                        //method to autopopulate system with books, assumes all the books have not been checked out
        bookList[0] = new Book(1, "12345678901", "48 Laws of Power");
        bookList[1] = new Book(2, "12345678902", "The Three-Body Problem");
        bookList[2] = new Book(3, "12345678903", "Atomic Habits");
        bookList[3] = new Book(4, "12345678904", "Fahrenheit 451");
        bookList[4] = new Book(5, "12345678905", "1984");
        bookList[5] = new Book(6, "12345678906", "Real Self-Care");
        bookList[6] = new Book(7, "12345678907", "The Let them Theory");
        bookList[7] = new Book(8, "12345678908", "The Power of Habit");
        bookList[8] = new Book(9, "12345678909", "The Gifts of Imperfection");
        bookList[9] = new Book(10, "12345678910", "The Body Keeps Score Brain, Mind, and Body in the Healing of Trauma");
        bookList[10] = new Book(11,"12345678911", "Set Boundaries, Find Peace: a Guide to Reclaiming Yourself");
        bookList[11] = new Book(12,"12345678912", "The Psychology of Money");
        bookList[12] = new Book(13,"12345678913", "mindset The New Psychology of Success");
        bookList[13] = new Book(14,"12345678914", "Outlive The Science & Art of Longegvity");
        bookList[14] = new Book(15,"12345679815", "Ikigai The Japanese Secret to a Long and Happy Life");
        bookList[15] = new Book(16,"12345678916", "The Anxious Generation");
        bookList[16] = new Book(17,"12345678917", "Daring Greatly");
        bookList[17] = new Book(18,"12345678918", "Essentialism The Disciplined Pursuit of Less");
        bookList[18] = new Book(19,"12345678919", "How To Do The Work Recognize Your Patterns, Heal From Your Past, + Create Your Self");
        bookList[19] = new Book(20,"12345678920", "The 7 Habits of Highly Effective People");
       // bookList[20] = new Book(1,"12345678921", "Four Thousand Weeks Time Management for Mortals");
    }
    public void StartMenu(){                                                                                        //main menu method of the Library System
        loadBooks();                                                                                                //generates all books

        boolean exitWhileLoop = false;                                                                              //boolean to control while loop main menu

        while(!exitWhileLoop) {
            System.out.println("Hello, User!, " +                                                                   //prompts user to make a selection
                    "\nWelcome to the Library Catalog System" +
                    "\nPlease input a number to make a selection:" +
                    "\n1 - Show Available Books" +
                    "\n2 - Show Checked Out Books" +
                    "\n3- Exit - close out of the application");

            int menuSelection = scanner.nextInt();
            scanner.nextLine();
            switch (menuSelection){                                                                                 //switch case to control which methods are being called at a given time
                case 1:
                    showAvailableBooks();                                                                           //will show the available books only and prompts user if they want to check out a book
                    break;
                case 2:
                    showCheckOutBooks();                                                                             //will show the checked out books and prompts user if they want to check in a book
                    break;
                case 3:
                    System.out.println("Exiting Application, Have a Good Evening User");                            //will exit the menu, while loop, and end the program
                    exitWhileLoop = true;
            }

        }


    }

    public void showAvailableBooks(){                                                                               //displays all non-checked out books and prompts user if they want to check out a book
        System.out.println("Available Books:");
        for (Book book : bookList){
            if(!book.getIsCheckOut()){                                                                               //for-each loop iterates through the array and only displays books that are not checked out
                book.displayBookInfo();
            }
        }
        System.out.println("Would you like to check out a book? 1 - Yes, 2 - No");                                    //prompt asking if user wants to check out a book
        int userInput = scanner.nextInt();
        scanner.nextLine();

        if(userInput == 1){
            System.out.print("You have selected to Check out a Book, please input the Book ID Number: ");             //prompt user to select a book by inputting the book ID number
            int BookID = scanner.nextInt();
            scanner.nextLine();
            checkOutBook(BookID);                                                                                     //method to prompt user to check out a book
            System.out.println("Book was succesfully Checked out, Enjoy!!" +
                    "\n Returning to main menu.");
        }
        else{
            System.out.println("Not checking out a book has been selected. Returning to main menu.");                 //only triggers if user doesn't select 1 as an answer
        }

    }

    public void showCheckOutBooks(){                                                                                  //uses for-each loop to display books that are checked out
        System.out.println("Checked Out Books: ");
        for (Book book : bookList){
            if(book.getIsCheckOut()){
                book.displayBookInfo();
            }
        }
        System.out.println("Would you like to check in a book? 1 - Yes, 2 - No");                                     //prompts user if they want to check in a book or not
        int userInput = scanner.nextInt();
        scanner.nextLine();

        if(userInput == 1){                                                                                          //if user says yes then it prompts to user to input the book ID number
            System.out.print("You have selected to Check in a Book, please input the Book ID Number: ");
            int BookID = scanner.nextInt();
            scanner.nextLine();
            bookList[BookID - 1].checkIn();
        }
    }

    public void checkOutBook(int bookID){                                                                           //method that prompts user for name and uses book's method of setting check out status + adding a name
        System.out.println("You have selected " + bookList[bookID -  1].getTitle() +
                            "\nPlease put your name for check out: ");

        bookList[bookID - 1].checkOut(scanner.nextLine());

    }

}
