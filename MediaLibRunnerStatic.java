/*
 * Activity 2.5.8
 * 
 * A runner for the MediaLibrary program
 */
public class MediaLibRunnerStatic
{
  public static void main(String[] args)
  {
    System.out.println(MediaLib.getOwner() + "'s Library");
    // MediaLib.changeOwner("Harini");

    MediaLib.owner = "Harini";
    System.out.println(MediaLib.getOwner() + "'s Library");

    
    MediaLib myBookLib = new MediaLib();
    Book myBook = new Book("The Midnight Library", "Matt Haig");
    myBookLib.addBook(myBook);
    
    MediaLib myMovieLib = new MediaLib();
    Movie myMovie = new Movie("Sing 2", 1.5);
    Movie myMovie1 = new Movie("Sing", 1.48);
    myMovieLib.addMovie(myMovie);
    myMovieLib.changeMovie(myMovie1);

    MediaLib mySongLib = new MediaLib();
    Song mySong = new Song("Try Everything");
    Song mySong1 = new Song("You're Welcome");
    mySongLib.addSong(mySong);
    // System.out.println(mySong + " equals " + mySong1 + ": " + mySong.equals(mySong1));
    
    System.out.println("Library: \n" + mySongLib);
    
    System.out.println("Total Entries: " + MediaLib.getNumEntries());

    // System.out.println("Total Song Entries: " + MediaLib.getNumSongEntries());
  }
}
