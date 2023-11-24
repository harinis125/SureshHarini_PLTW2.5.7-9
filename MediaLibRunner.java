// Harini Suresh
/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    //System.out.println("Book created " + myBook);
    
    myLib.addBook(myBook);
    //System.out.println("Library:\n" + myLib);

    int myRating = 5;
    myBook.adjustRating(myRating);
    //System.out.println(myBook);

    myBook.setTitle("Harry Potter");
    //System.out.println("Book:" + myBook);
    //System.out.println("Library: " + myLib);


    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    //System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    //System.out.println(myLib2);

    // System.out.println("before test:" + newBook);
    // myLib.testBook(newBook);
    // System.out.println("after test:" + newBook);

    Book newBook2 = new Book("1984", "Orwell");
    newBook2.setAuthor("JK Rowling");
    System.out.println(newBook + " equals " + newBook2 + ": " + newBook.equals(newBook2));

    // erroneous: System.out.println(newBook2.title);
    
    Movie newMovie = new Movie("The Lion King", 1.75);
    myLib2.addMovie(newMovie);
    System.out.println("Library: \n" + myLib2);
    
  }
}
