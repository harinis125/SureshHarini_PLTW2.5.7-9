// Harini Suresh
/*
 * Activity 2.5.9
 * 
 * A runner for the MediaLibrary program
 */
public class MediaLibRunnerScope
{
  public static void main(String[] args)
  {
    MediaLib myLib = new MediaLib();
    myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
    myLib.addBook(new Book("1984", "Orwell"));
    myLib.addSong(new Song("In Your Eyes"));
    System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);

    Book myBook = new Book("Biscuit", "Alyssa Capucilli");
    myBook.adjustRating(3);
    myBook.adjustRating(5);
    System.out.println(myBook.getRating());
  }
}
