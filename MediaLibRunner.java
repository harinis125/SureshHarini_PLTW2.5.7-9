public class MediaLibRunner
{
  public static void main(String[] args)
  {
  System.out.println("Welcome to your Media Library");
  MediaLib myLib = new MediaLib();


  Book myBook = new Book("The Lord of the Rings", "Tolkien");
  System.out.println("Book created " + myBook);
  System.out.println("Library:\n" + myLib);
  myLib.addBook(myBook);
  System.out.println("Library:\n" + myLib);


  int myRating = 5;
  myBook.adjustRating(myRating);
  System.out.println(myBook);
  System.out.println("myRating=" + myRating);


  myBook.adjustRating(15);
  System.out.println(myBook);
  myBook.adjustRating(-10);
  System.out.println(myBook);

    
  System.out.println("Book changed!");
  myBook.setTitle("Fellowship of the Ring");
  myBook.adjustRating(5); // or myBook.setAuthor("JRR Tolkien");
  System.out.println("Book:" + myBook);
  System.out.println("Library: " + myLib);


  System.out.println("You have a NEW Library");
  MediaLib myLib2 = new MediaLib();

  Book newBook = new Book("To Kill a Mockingbird", "Lee");
  myLib2.addBook(newBook);
  System.out.println(myLib2);
  newBook = new Book("1984", "Orwell");
  System.out.println(myLib2);


  /*
  System.out.println("before test " + newBook);
  myLib.testBook(newBook);
  System.out.println("after test" + newBook);
  */


  Book newBook2 = new Book("1984", "Orwell");
  System.out.println(newBook2 + " equal " + newBook + "? "  + newBook2.equals(newBook));
  newBook2.setAuthor("George Orwell");
  System.out.println(newBook2 + " equal " + newBook + "? "  + newBook2.equals(newBook));  

  }
}

