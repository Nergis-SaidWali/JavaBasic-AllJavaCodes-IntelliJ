package class18HW;

public class Book {
    /*
    * Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/
    String name;
    String author;
    String genre;
    int pageNumber;
    int yearOfPublish;

    public Book(String name, String author, String genre) {
       this.name=name;
       this.author=author;
       this.genre=genre;
    }
     public Book(int pageNumber, int yearOfPublish) {
        this.pageNumber=pageNumber;
        this.yearOfPublish=yearOfPublish;
     }

    public static void main(String[] args) {
        new Book("The Kite Runner", "Khaled Hosseini", "novel");
        new Book(371, 2003);
    }

}
